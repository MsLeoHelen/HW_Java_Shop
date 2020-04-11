package entity;

import java.util.*;

public class Shop{
    private List<Product> list = new ArrayList<>();

    public Shop() {
    }

    public Shop(List<Product> list) {
        this.list = list;
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public void addProduct(Product prod) {
        if (list.contains(prod)) {
            System.out.println("Товар с таким id уже существует.");
            System.out.println("Товар не добавлен.");
        }
        list.add(prod);
    }
}
