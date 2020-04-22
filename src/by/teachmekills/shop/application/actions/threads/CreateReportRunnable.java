package by.teachmekills.shop.application.actions.threads;

import by.teachmekills.shop.application.util.Output;
import by.teachmekills.shop.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class CreateReportRunnable implements Runnable {
    private static final String FILENAME = "Report.txt";
    private List<Product> products;

    public CreateReportRunnable(List<Product> products) {
        this.products = products;
    }

    @Override
    public void run() {
        Output.clearFile(FILENAME);
        Output.setInFile(FILENAME, reportProductsName(products));
        Output.setInFile(FILENAME, reportProductsSumPrice(products));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Отчет готов");
    }

    private String reportProductsName(List<Product> products) {
        StringBuffer str = new StringBuffer("Список всех товаров:\n");
        for (Product product : products) {
            str.append(product + "\n");
        }
        return str.toString();
    }

    private String reportProductsSumPrice(List<Product> products) {
        int sumPrice = 0;
        for (Product product : products) {
            sumPrice += product.getPrice();
        }
        return "Общая сумма всех товаров - " + sumPrice;
    }
}
