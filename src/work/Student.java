package work;


import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        System.out.print("Прошли ли вы водительский курс? (true/false): ");
        boolean hasDrivingCourse = scanner.nextBoolean();

        System.out.print("Являетесь ли вы гражданином? (true/false): ");
        boolean isCitizen = scanner.nextBoolean();

        if (age >= 18) {
            System.out.println("Вы совершеннолетний.");
            if (hasDrivingCourse) {
                System.out.println("Вы можете получить водительские права.");
            } else {
                System.out.println("Для получения водительских прав необходимо пройти водительский курс.");
            }
            if (isCitizen) {
                System.out.println("Вы можете голосовать.");
            } else {
                System.out.println("Для голосования необходимо быть гражданином.");
            }
        } else {
            System.out.println("Вы несовершеннолетний.");
        }

        scanner.close();
    }

    }
