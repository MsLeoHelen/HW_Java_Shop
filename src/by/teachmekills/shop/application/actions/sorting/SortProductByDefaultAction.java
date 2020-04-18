package by.teachmekills.shop.application.actions.sorting;

import by.teachmekills.shop.entity.Product;

public class SortProductByDefaultAction implements SortProductAction {
    @Override
    public String getName() {
        return "По добавлению";
    }

    @Override
    public int compare(Product o1, Product o2) {
        return -1;
    }
}
