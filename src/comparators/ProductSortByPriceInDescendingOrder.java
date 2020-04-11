package comparators;

import entity.Product;

import java.util.Comparator;

public class ProductSortByPriceInDescendingOrder implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
