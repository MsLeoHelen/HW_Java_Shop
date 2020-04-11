import java.util.List;
import java.util.Scanner;

public interface Command<T> {
    Scanner scanner = new Scanner(System.in);
    boolean run(List<T> list);
}
