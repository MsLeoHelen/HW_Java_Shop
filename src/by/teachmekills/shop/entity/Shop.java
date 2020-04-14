package by.teachmekills.shop.entity;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private static Shop shop;
    private List<Product> products;

    private Shop(){
        products = new ArrayList<>();
    }

    public static Shop getInstance(){
        if(shop == null){
            shop = new Shop();
        }
        return shop;
    }

    public void addProduct(Product product){
        if(products.contains(product)) return;
        products.add(product);
    }

    public List<Product> getProducts(){
        return products;
    }

    public void removeProduct(int id){
        products.remove(new Product(id));
    }

    public void updateProduct(Product product){
        int index = products.indexOf(product);
        if (index >= 0) products.set(index, product);
    }
}
