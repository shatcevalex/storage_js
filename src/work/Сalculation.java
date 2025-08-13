package work;

import java.util.Scanner;

public class Сalculation {
    public static void main(String[] args) {

        //Программа, которая:
        // 1) Запрашивает у пользователя число n.
        // 2) Вычисляет сумму всех чисел от 1 до n, которые делятся на 3 или на 5.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) {

            System.out.print(i);

        }



    }
}
