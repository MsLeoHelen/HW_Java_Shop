package by.teachmekills.shop.application.actions;

import by.teachmekills.shop.application.config.SortingConfig;
import by.teachmekills.shop.application.actions.sorting.SortProductAction;
import by.teachmekills.shop.application.util.Input;
import by.teachmekills.shop.entity.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ShowProductsAction extends BaseAction implements Action {
    private static final String NAME = "Вывод всех товаров";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void run() {
        List<Product> products = new ArrayList<>(shop.getProducts());
        Comparator<Product> comparator = selectSorting();
        products.sort(comparator);
        System.out.println("***** Все товары *****");
        for (Product product : products){
            System.out.println(product);
        }
        System.out.println("**********************");
    }

    private Comparator<Product> selectSorting() {
        showMenu();
        int key = Input.getInt();
        if(SortingConfig.sorting.containsKey(key)){
            return SortingConfig.sorting.get(key);
        }
        System.out.println("Нет такой сортировки! Повторите ввод");
        return selectSorting();
    }

    private void showMenu() {
        for (Map.Entry<Integer, SortProductAction> entry : SortingConfig.sorting.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }
    }


}
