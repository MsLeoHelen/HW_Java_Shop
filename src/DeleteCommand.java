import java.util.List;

public class DeleteCommand implements Command<Product> {
    @Override
    public boolean run(List<Product> list) {
        System.out.print("Введи id товара для удаление: ");
        int id = scanner.nextInt();
        if (!list.contains(new Product(id))) {
            System.out.println("Нет товара с таким id.");
            System.out.println();
            return false;
        }
        list.remove(list.indexOf(new Product(id)));
        System.out.println("Товар успешно удален.");
        System.out.println();
        return true;
    }
}
