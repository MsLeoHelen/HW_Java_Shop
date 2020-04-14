package by.teachmekills.shop.application.config;

import by.teachmekills.shop.application.actions.*;

import java.util.HashMap;
import java.util.Map;

public class ActionConfig {
    public static Map<Integer, Action> actions = new HashMap<>();
    static {
        actions.put(1, new AddProductAction());
        actions.put(2, new ShowProductsAction());
        actions.put(3, new UpdateProductAction());
        actions.put(4, new RemoveProductAction());
        actions.put(0, new StopApplicationAction());
    }
}
