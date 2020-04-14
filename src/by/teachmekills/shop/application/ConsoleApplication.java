package by.teachmekills.shop.application;

import by.teachmekills.shop.application.actions.*;
import by.teachmekills.shop.application.config.ActionConfig;
import by.teachmekills.shop.application.exceptions.StopApplicationException;
import by.teachmekills.shop.application.util.Input;

import java.util.Map;

public class ConsoleApplication {

    public void start(){
        System.out.println("Привет");
        run();
        System.out.println("Пока");
    }

    private void run(){
        while (true){
            Action action = selectAction();
            try {
                action.run();
            } catch (StopApplicationException e) {
                break;
            }
        }
    }

    private Action selectAction(){
        showMenu();
        int key = Input.getInt();
        if (ActionConfig.actions.containsKey(key)){
            return ActionConfig.actions.get(key);
        }
        System.out.println("Нет такого действия!!! Повторите ввод");
        return selectAction();
    }

    private void showMenu(){
        for (Map.Entry<Integer, Action> entry : ActionConfig.actions.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }
    }


}
