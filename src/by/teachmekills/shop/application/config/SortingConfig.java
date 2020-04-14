package by.teachmekills.shop.application.config;

import by.teachmekills.shop.application.actions.sorting.SortProductAction;
import by.teachmekills.shop.application.actions.sorting.SortProductByDefaultAction;
import by.teachmekills.shop.application.actions.sorting.SortProductByNameAction;
import by.teachmekills.shop.application.actions.sorting.SortProductByPriceAction;

import java.util.HashMap;
import java.util.Map;

public class SortingConfig {
    public static Map<Integer, SortProductAction> sorting = new HashMap<>();
    static {
        sorting.put(1, new SortProductByPriceAction());
        sorting.put(2, new SortProductByNameAction());
        sorting.put(3, new SortProductByDefaultAction());
    }
}
