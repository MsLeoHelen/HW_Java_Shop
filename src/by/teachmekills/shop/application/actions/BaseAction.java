package by.teachmekills.shop.application.actions;

import by.teachmekills.shop.application.util.Input;
import by.teachmekills.shop.entity.Product;
import by.teachmekills.shop.entity.Shop;

public abstract class BaseAction {
    protected Shop shop = Shop.getInstance();

    protected Product createProduct(){
        int id = Input.getInt("Введите id");
        String name = Input.getString("Введите название");
        int price = Input.getInt("Введите цену");
        return new Product(id, name, price);
    }
}