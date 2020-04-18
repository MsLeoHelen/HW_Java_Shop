package by.teachmekills.shop.application.actions;

import by.teachmekills.shop.application.exceptions.StopApplicationException;
import by.teachmekills.shop.entity.Product;

import by.teachmekills.shop.application.util.Output;
import java.util.ArrayList;
import java.util.List;

public class ReportProductAction extends BaseAction implements Action {
    private static final String NAME = "Вывод отчета";
    private static String filename = "Report.txt";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void run() throws StopApplicationException {
        List<Product> products = new ArrayList<>(shop.getProducts());
        Output.clearFile(filename);
        Output.setInFile(filename, reportProductsName(products));
        Output.setInFile(filename, reportProductsSumPrice(products));
    }

    private String reportProductsName(List<Product> products) {
        StringBuffer str = new StringBuffer("Список всех товаров:\n");
        for (Product product : products) {
            str.append(product.getName() + "\n");
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
