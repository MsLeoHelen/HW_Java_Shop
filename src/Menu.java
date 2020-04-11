import commands.*;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Product> list;
    Scanner scanner = new Scanner(System.in);

    public void start(Shop shop) {
        System.out.println("Запуск программы.");
        this.list = shop.getList();
        System.out.println();
        run();
        System.out.println("Завершение программы.");
    }

    private void run() {
        while (true) {
            Command command = selectCommand();
            System.out.println();
            if (command == null)
                break;
            command.run(list);
        }
    }

    private Command selectCommand() {
        showMenu();
        switch (scanner.nextInt()) {
            case 1: return new ShowCommand();
            case 2: return new AddCommand();
            case 3: return new DeleteCommand();
            case 4: return new EditCommand();
            case 0: return null;
            default:
                System.out.println("Нет такого пункта.");
                System.out.println();
                return selectCommand();
        }
    }

    private void showMenu() {
        System.out.println("1. Вывод всех товаров.");
        System.out.println("2. Добавление товара.");
        System.out.println("3. Удаление товара.");
        System.out.println("4. Редактирование товара.");
        System.out.println("0. Выход");
        System.out.print("Веберите действие: ");
    }
}
