package work;

import java.util.Scanner;

public class Сalculation {
    public static void main(String[] args) {

        //Программа, которая:
        // 1) Запрашивает у пользователя число n.
        // 2) Вычисляет сумму всех чисел от 1 до n, которые делятся на 3 или на 5.
        // 3) Необходимо использовать циклы

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n ; i++) {

            if (i % 3 == 0 || i % 5 == 0)
                sum += i; // добавляем число к сумме


        }
        System.out.println(sum);



    }
}
