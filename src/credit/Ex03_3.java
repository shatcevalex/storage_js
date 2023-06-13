package credit;

import java.util.Scanner;

public class Ex03_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество секунд : ");
        float second = scanner.nextFloat();

        float hours = (second / 3600);
        double a = 0.9999;
        double b = 0.0001;


        if (hours >= 7 && hours < 8){
            System.out.println("Осталось 8 часов");
        }else if (hours >= 6 && hours < 7){
            System.out.println("Осталось 6 часов");
        }else if (hours >= 5 && hours < 6){
            System.out.println("Осталось 5 часов");
        }else if (hours >= 4 && hours < 5){
            System.out.println("Осталось 4 часа");
        }else if (hours >= 3 && hours < 4){
            System.out.println("Осталось 3 часа");
        }else if (hours >= 2 && hours < 3) {
            System.out.println("Осталось 2 часа");
        }else if (hours >= 1 && hours < 2){
            System.out.println("Остался 1 час");
        }else if (hours > b && hours < a){
            System.out.println("Осталось менее часа");
        } else if (hours < b){
            System.out.println("Рабочий день закончился");
        } else if (hours > 8){
            System.out.println("Введенное число больше 8 часового рабочего дня");
        }

    }
}
