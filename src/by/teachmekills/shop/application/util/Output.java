package by.teachmekills.shop.application.util;

import by.teachmekills.shop.entity.Product;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Output {
    public static void clearFile(String filename) {
        try(FileWriter writer = new FileWriter(filename, false)) {
            writer.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void setInFile(String filename, String str) {
        try(FileWriter writer = new FileWriter(filename, true)) {
            writer.write(str + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
