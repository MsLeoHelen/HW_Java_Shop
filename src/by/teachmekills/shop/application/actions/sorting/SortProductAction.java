package by.teachmekills.shop.application.actions.sorting;

import by.teachmekills.shop.entity.Product;

import java.util.Comparator;

public interface SortProductAction extends Comparator<Product> {
    String name();
}
