package credit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ex03_2 {

        public static void main(String[] args) throws ParseException {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите день : ");
            int day = scanner.nextInt();

            System.out.print("Введите месяц : ");
            int month = scanner.nextInt();

            System.out.print("Введите год : ");
            int year = scanner.nextInt();

            int day2 = day + 1;
            int month2 = month - 1;

            SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
            Calendar calendar = new GregorianCalendar(year,month2,day2);

            System.out.println("Следующий день : " + formater.format(calendar.getTime()));




        }
    }

