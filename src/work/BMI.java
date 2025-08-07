package work;

// Программа которая считает индекс массы тела
// 1) Запрашивает у пользователя в консоли данные
// 2) Вычисляет индекс массы тела (ИМТ) по формуле: BMI = вес / (рост * рост)
// 3) Выводит результат

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя ");
        String name = scanner.nextLine();

        System.out.println("Введите возраст ");
        int age = scanner.nextInt();

        System.out.println("Введите вес ");
        int weidht = scanner.nextInt();

        System.out.println("Введите рост в метрах ");
        double height = scanner.nextDouble();

        double BMI =  weidht / (height * height);

        System.out.println("Привет, " + name + " тебе " + age + " лет " + " твой BMI = " + BMI);

    }
}
