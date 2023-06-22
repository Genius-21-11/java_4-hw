// https://leetcode.com/problems/valid-parentheses/
// Учитывая строку s, содержащую только символы '(', ')', '{', и , определите '}', допустима ли входная строка.'['']'
// Входная строка действительна, если:
// Открытые скобки должны быть закрыты однотипными скобками.
// Открытые скобки должны быть закрыты в правильном порядке.
// Каждой закрывающей скобке соответствует открытая скобка того же типа.
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скобки: ");
        String text1 = sc.nextLine();
        sc.close();
        System.out.println(check(text1));
    }

    public static boolean check(String s) {
        Deque<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' ||
                    s.charAt(i) == '{' ||
                    s.charAt(i) == '[')
                list.add(s.charAt(i));
            else {
                if (list.isEmpty())
                    return false;
                else if (s.charAt(i) == ')' && list.getLast().equals('('))
                    list.pollLast();
                else if (s.charAt(i) == '}' && list.getLast().equals('{'))
                    list.pollLast();
                else if (s.charAt(i) == ']' && list.getLast().equals('['))
                    list.pollLast();
                else
                    return false;
            }
        }
        return list.isEmpty();
    }
}
