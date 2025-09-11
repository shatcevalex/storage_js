package work;

import java.util.Scanner;

public class Graf_pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();

        // Вывод только четных чисел
       // for (int i = 0 ; i <= n; i++)  {
       //     if (i % 2 == 0){
       //         System.out.print(i + " ");
       //      }
       //   }


        // С помощью while выведи числа от n до 1 в обратном порядке
        // int i = 1;
        // while (i <= n){
        //    System.out.println(n + " ");
        //    n--;
        //   }

      // С помощью do…while выведи числа от 1 до n
        int i = 1;
        do {
            System.out.println(i + " " );
            i++;
        } while (i <= n);


    }
}
