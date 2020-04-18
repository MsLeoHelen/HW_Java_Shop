package by.teachmekills.shop.application.actions.sorting;

import by.teachmekills.shop.entity.Product;

public class SortProductByNameAction implements SortProductAction {
    private static final String NAME = "По названию";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
