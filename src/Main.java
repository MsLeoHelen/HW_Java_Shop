public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addProduct(new Product(4, "земля", 60));
        shop.addProduct(new Product(5, "огонь", 20));
        shop.addProduct(new Product(1, "вода", 90));
        shop.addProduct(new Product(3, "воздух", 10));
        shop.addProduct(new Product(2, "любовь", 50));

        Menu menu = new Menu();
        menu.start(shop);
    }
}
