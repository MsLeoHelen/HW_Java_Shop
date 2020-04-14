package by.teachmekills.shop.application.actions;

public class AddProductAction extends BaseAction implements Action {
    private static final String NAME = "Добавление товара";


    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void run() {
        shop.addProduct(createProduct());
    }
}
