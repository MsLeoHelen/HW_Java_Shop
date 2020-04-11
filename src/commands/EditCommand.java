package commands;

import java.util.List;

public class EditCommand implements Command<Product> {
    @Override
    public boolean run(List<Product> list) {
        Product prod = Product.creation();
        if (!list.contains(prod)) {
            System.out.println("Нет товара с таким id.");
            System.out.println();
            return true;
        }
        int index = list.indexOf(new Product(prod.getId()));
        list.remove(index);
        list.add(index, prod);
        System.out.println("Товар успешно изменен.");
        System.out.println();
        return true;
    }
}
