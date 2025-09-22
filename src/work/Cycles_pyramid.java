package work;

import java.util.Scanner;

public class Cycles_pyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число ");
        int n = scanner.nextInt();

            // Верхняя половина ромба
        for (int i = 0; i < n ; i++) {
            // печатаем пробелы
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            // печатаем звёздочки
            for (int j = 0; j <= 2 * i  ; j++ ) {
                System.out.print("*");
                
            }
              System.out.println();
        }
             // Нижняя половина ромба
        for (int i = n - 1; i >= 1 ; i--) {
            // Печатаем пробелы
            for (int j = 1; j <= n - i; j++ ) {
                System.out.print(" ");
                
            }
            // Печатаем звездочки
            for (int j = 2; j <= 2 * i ; j++) {
                System.out.print("*");


            }
            System.out.println();
            
            
        }

    }
}
