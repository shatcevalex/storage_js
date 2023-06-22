package credit;

public class Ex04_4 {


        public static void main(String[] args) {

            int[] WarCar = new int[99999];
            String tmp;
            int first = 0;

            for (int i = 0; i < WarCar.length; i++) {
                WarCar[i] = i;

                tmp = Integer.toString(WarCar[i]);

                if (tmp.contains("4") || tmp.contains("13")) {
                    first++;
                }
            }
            System.out.print("Нужно исключить " + first + " едениц боевой техники ");

        }
    }

