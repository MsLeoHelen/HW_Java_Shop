package by.teachmekills.shop.application.actions;

public class UpdateProductAction extends BaseAction implements Action {
    private static final String NAME = "Редактирование товара";


    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void run() {
        shop.updateProduct(createProduct());
    }
}
