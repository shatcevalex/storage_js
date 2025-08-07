package work;

import java.util.Scanner;

public class Сalculator {
    public static void main(String[] args) {


        // Пишем калькулятор который:
        // 1) Принимает два числа и операцию (+, -, *, /) с консоли.
        // 2) В зависимости от операции, вычисляет и выводит результат.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число ");
        int a = scanner.nextInt();

        System.out.println("Введите второе число ");
        int b = scanner.nextInt();

        System.out.println("Введите операцию (+, -, *, /): ");
        char c = scanner.next().charAt(0);

        if (c == '+') {
            int one = a + b;
            System.out.println("Ответ "+ one);
        }
        if (c == '-'){
            int too = a - b;
            System.out.println("Ответ "+ too);
        }
        if (c == '*'){
            int three = a * b;
            System.out.println("Ответ "+ three);
        }
        if (c == '/'){
            int four = a / b;
            int five = a % b;
            System.out.println("Ответ "+ four + "."+ five);
        }


    }

}
