package exam;

import java.util.Scanner;

public class Main03_grade {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Количество секунд : ");
            int second = scanner.nextInt();
            int year = 31449600; // 52 недели в секундах
            int week = year / 52;
            int day = week / 7;
            int hour = day / 24;
            int minute = hour / 60;

            int WEEK_Print = second / week;
            int WEEK_OST = second - (week * WEEK_Print);

            int DAY_Print = WEEK_OST / day;
            int DAY_OST = WEEK_OST - (day * DAY_Print);

            int HOUR_Print = DAY_OST / hour;
            int HOUR_OST = DAY_OST - (hour * HOUR_Print);

            int MINUTE_Print = HOUR_OST / minute;
            int MINUTE_OST = HOUR_OST - (minute * MINUTE_Print);

            // Склонение "Недели"

            if (WEEK_Print == 1){
                System.out.print(WEEK_Print + " Неделя ");
            } else if (WEEK_Print >= 2 && WEEK_Print <= 4){
                System.out.print(WEEK_Print + " Недели ");
            } else if (WEEK_Print >= 5)
                System.out.print(WEEK_Print + " Недель ");

            // Склонение "Дни"

            if (DAY_Print == 1){
                System.out.print(DAY_Print + " Сутки ");
            } else if (DAY_Print >= 2)
                System.out.print(DAY_Print + " Суток ");

            //Склонение "Часы"

            if (HOUR_Print == 1){
                System.out.print(HOUR_Print + " Час ");
            } else if (HOUR_Print >= 2 && HOUR_Print <= 4){
                System.out.print(HOUR_Print + " Часа ");
            } else if (HOUR_Print >= 5 && HOUR_Print <= 20){
                System.out.print(HOUR_Print + " Часов ");
            } else if (HOUR_Print == 21 ){
                System.out.print(HOUR_Print + " Час ");
            }else if (HOUR_Print >= 22 )
                System.out.print(HOUR_Print + " Часа ");

            //Склонение "Минуты"

            if (MINUTE_Print == 1){
                System.out.print(MINUTE_Print + " Минута ");
            } else if (MINUTE_Print >= 2 && MINUTE_Print <= 4){
                System.out.print(MINUTE_Print + " Минуты ");
            } else if (MINUTE_Print >= 5 && MINUTE_Print <= 20){
                System.out.print(MINUTE_Print + " Минут ");
            } else if (MINUTE_Print == 21){
                System.out.print(MINUTE_Print + " Минута ");
            }else if (MINUTE_Print >= 22 && MINUTE_Print <= 24){
                System.out.print(MINUTE_Print + " Минуты ");
            }else if (MINUTE_Print >= 25 && MINUTE_Print <= 30) {
                System.out.print(MINUTE_Print + " Минут ");
            }else if (MINUTE_Print == 31){
                System.out.print(MINUTE_Print + " Минута ");
            }else if (MINUTE_Print >= 32 && MINUTE_Print <= 34){
                System.out.print(MINUTE_Print + " Минуты ");
            }else if (MINUTE_Print >= 35 && MINUTE_Print <= 40){
                System.out.print(MINUTE_Print + " Минут ");
            }else if (MINUTE_Print == 41){
                System.out.print(MINUTE_Print + " Минута ");
            }else if (MINUTE_Print >= 42 && MINUTE_Print <= 44){
                System.out.print(MINUTE_Print + " Минуты ");
            }else if (MINUTE_Print >= 45 && MINUTE_Print <= 50){
                System.out.print(MINUTE_Print + " Минут ");
            }else if (MINUTE_Print == 51){
                System.out.print(MINUTE_Print + " Минута ");
            }else if (MINUTE_Print >= 52 && MINUTE_Print <= 54){
                System.out.print(MINUTE_Print + " Минуты ");
            }else if (MINUTE_Print >= 55)
                System.out.print(MINUTE_Print + " Минут ");

            //Склонение "Секунды"

            if (MINUTE_OST == 1){
                System.out.print(MINUTE_OST + " Секунда");
            } else if (MINUTE_OST >= 2 && MINUTE_OST <= 4){
                System.out.print(MINUTE_OST + " Секунды");
            } else if (MINUTE_OST >= 5 && MINUTE_OST <= 20){
                System.out.print(MINUTE_OST + " Секунд");
            } else if (MINUTE_OST == 21){
                System.out.print(MINUTE_OST + " Секунда");
            }else if (MINUTE_OST >= 22 && MINUTE_OST <= 24){
                System.out.print(MINUTE_OST + " Секунды");
            }else if (MINUTE_OST >= 25 && MINUTE_OST <= 30) {
                System.out.print(MINUTE_OST + " Секунд");
            }else if (MINUTE_OST == 31){
                System.out.print(MINUTE_OST + " Секунда");
            }else if (MINUTE_OST >= 32 && MINUTE_OST <= 34){
                System.out.print(MINUTE_OST + " Секунды");
            }else if (MINUTE_OST >= 35 && MINUTE_OST <= 40){
                System.out.print(MINUTE_OST + " Секунд");
            }else if (MINUTE_OST == 41){
                System.out.print(MINUTE_OST + " Секунда");
            }else if (MINUTE_OST >= 42 && MINUTE_OST <= 44){
                System.out.print(MINUTE_OST + " Секунды");
            }else if (MINUTE_OST >= 45 && MINUTE_OST <= 50){
                System.out.print(MINUTE_OST + " Секунд");
            }else if (MINUTE_OST == 51){
                System.out.print(MINUTE_OST + " Секунда");
            }else if (MINUTE_OST >= 52 && MINUTE_OST <= 54){
                System.out.print(MINUTE_OST + " Секунды");
            }else if (MINUTE_OST >= 55)
                System.out.print(MINUTE_OST + " Секунд");

        }
    }

