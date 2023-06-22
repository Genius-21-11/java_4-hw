// Вывести список на экран в перевернутом виде (без массивов и ArrayList).
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int n = sc.nextInt();
        sc.close();
        Deque<Integer> ourDeque = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            ourDeque.add(i);
        }
        System.out.println(ourDeque);

        System.out.println("Перевернутый список");
        while (ourDeque.size() > 0) {
            System.out.print(ourDeque.pollLast() + " ");
        }
    }
}