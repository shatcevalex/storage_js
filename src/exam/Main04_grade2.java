package exam;

import java.util.Scanner;

public class Main04_grade2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a : ");
        int a = scanner.nextInt();

        System.out.print("Введите b : ");
        int b = scanner.nextInt();

        System.out.print("Введите h : ");
        int h = scanner.nextInt();

        // Самое высокое дерево в мире - это Кипасис гималайский , высота 102 метра.
        // Берем эту велечину за максимальное значение.

        int max_h = 102;
        int day = a - b;

        if (a > max_h){
            System.out.println("Дерева такой высоты не существует");
        }if (a >= h) {
            System.out.println("Количество дней : 1");
        }if (day <= 0 ){
            System.out.println("Невозможно");
        }else{
            int first = 0;
            int second = 0;
            while (second < h) {
                first++;
                second = second + a;
                if (second >= h) {
                    break;
                } else {
                    second = second - b;
                }
            }
            System.out.println("Количество дней : " + first);

        }



    }
}

