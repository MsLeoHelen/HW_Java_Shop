package by.teachmekills.shop.application.actions.sorting;

import by.teachmekills.shop.entity.Product;

public class SortProductByPriceAction implements SortProductAction {
    private static final String NAME = "По цене";

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
