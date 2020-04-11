package commands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ShowCommand implements Command<Product> {
    @Override
    public boolean run(List<Product> list) {
        ArrayList<Product> tempList = new ArrayList<Product>(list);
        selectChoices(tempList);
        Iterator<Product> iterator = tempList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next().toString());
        System.out.println();
        return true;
    }

    private void selectChoices(List<Product> list){
        showChoices();
        switch (scanner.nextInt()) {
            case 1:
                System.out.println();
                System.out.println("Список товаров в магазние (отсортированы по цене по возрастанию):");
                Collections.sort(list, new ProductSortByPriceInAscendingOrder());
                break;
            case 2:
                System.out.println();
                System.out.println("Список товаров в магазние (отсортированы по цене по убыванию):");
                Collections.sort(list, new ProductSortByPriceInDescendingOrder());
                break;
            case 3:
                System.out.println();
                System.out.println("Список товаров в магазние (по добавлениею: сначала новые, затем старые):");
                Collections.sort(list, new ProductSortByTime());
                break;
            default:
                System.out.println("Нет такого пункта.");
                System.out.println();
                selectChoices(list);
        }
    }

    private void showChoices() {
        System.out.println("Варианты сортировки: ");
        System.out.println("1. По цене (по возрастанию).");
        System.out.println("2. По цене (по убыванию).");
        System.out.println("3. По добавлению (сначала новые, потом старые).");
        System.out.print("Введите варинат сортировки: ");
    }
}
