package by.teachmekills.shop.application.util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static int getInt(){
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }
        String line =  scanner.next();
        System.out.println(line + " - это не целое число!!! Повторите ввод");
        return getInt();
    }

    public static int getInt(String message){
        System.out.println(message);
        return getInt();
    }

    public static String getString(){
        return scanner.next();
    }

    public static String getString(String message){
        System.out.println(message);
        return getString();
    }

}
