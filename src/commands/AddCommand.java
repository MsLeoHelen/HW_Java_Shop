package commands;

import java.util.List;

public class AddCommand implements Command<Product> {
    @Override
    public boolean run(List<Product> list) {
        Product prod = Product.creation();
        if (list.contains(prod)) {
            System.out.println("Товар с таким id уже существует.");
            System.out.println("Товар не добавлен.");
            System.out.println();
            return false;
        }
        list.add(prod);
        System.out.println("Товар добавлен.");
        System.out.println();
        return true;
    }
}
