package by.teachmekills.shop.application.actions;

import by.teachmekills.shop.application.util.Input;

public class RemoveProductAction extends BaseAction implements Action {
    private static final String NAME = "Удаление товара";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void run() {
        int id = Input.getInt("Введите id");
        shop.removeProduct(id);
    }
}
