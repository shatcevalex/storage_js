package work;

import java.util.Scanner;

public class Cycles_calk {
    // Программа которая :
    // 1) Запрашивает у пользователя число n.
    // 2) Выводит таблицу умножения на n от 1 до 10 с помощью цикла for.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int n = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i + " x "+ n + " = " + (i * n ));
        }
    }
}
