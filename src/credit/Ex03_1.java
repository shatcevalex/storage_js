package credit;

import java.util.Scanner;

public class Ex03_1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите значение а =  ");
            int a = scanner.nextInt();
            System.out.print("Введите значение b =  ");
            int b = scanner.nextInt();
            System.out.print("Введите значение r =  ");
            int r = scanner.nextInt();

            int D = (r * r) + (r * r);
            int X = (a * a) + (b * b);
            while (true) {

                if (D >= X) {
                    System.out.print("Картонка с радиусом "+ r);
                    System.out.print(" закрывает полностью отверстие размера " + a);
                    System.out.print(" * " + b);
                    break;

                } else if (D < X){
                    System.out.print("Картонка с радиусом "+ r);
                    System.out.print(" не закрывает полностью отверстие размера " + a);
                    System.out.print(" * " + b);
                    break;

                }
            }
        }
    }

