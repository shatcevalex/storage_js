package work;

public class Data_types_variables_operators {
    public static void main(String[] args) {

        int integerVar = 10;
        double doubleVar = 20.5;
        char charVar = 'A';
        boolean booleanVar = true;

        System.out.println(integerVar);
        System.out.println(doubleVar);
        System.out.println(charVar);
        System.out.println(booleanVar);

        String name = "Alex";
        int age = 31;
        double averageGrade = 8.7;

        System.out.println("__________________________________");
        System.out.println("Имя " + name);
        System.out.println("Возраст " + age);
        System.out.println("Средний балл " + averageGrade);


        int a = 45;
        int b = 54;

        System.out.println("__________________________________");
        System.out.println("Сложение " + (a+b));
        System.out.println("Вычитание " + (b-a));
        System.out.println("Умножение " + (a*b));
        System.out.println("Деление " + (b/a));
        System.out.println("Остаток от деления " + (b%a));
        System.out.println("___________________________________");


        boolean isAdult = true;
        boolean hasLicense = false;

        if (isAdult && hasLicense) {
            System.out.println("Можно водить машину?");
        }else{
            System.out.println("Нельзя водить машину ");

        }


    }
}
