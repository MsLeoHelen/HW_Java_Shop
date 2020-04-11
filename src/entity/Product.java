package entity;

import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(int id) {
        this.id = id;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return id + ": " + name + " " +price;
    }

    @Override
    public boolean equals(Object o) {
        Product prod = (Product) o;
        return this.id == prod.getId();
    }

    public static Product creation(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите id товара: ");
        int id = scanner.nextInt();
        System.out.print("Введите название товара: ");
//        String name = "";
//        while(!scanner.hasNext()){
//            name += scanner.next();
//        }
        String name = scanner.next();
        System.out.print("Ведите стоимость товара: ");
        int price = scanner.nextInt();
        return new Product(id, name, price);

    }
}
