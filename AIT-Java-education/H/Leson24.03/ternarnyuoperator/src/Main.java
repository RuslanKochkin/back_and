//_________----------------------------тернарный оператор---------------------------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 1;
        System.out.println( "Jgthfwbz" + ((choice ==0) ? "не " : "" ) + "Завершилась");
        if (choice==0){
            System.out.println("Операция не завершена");
        }else {
            System.out.println("Операция завершена");
        }
        int a = 3;
        int b = 5;
        System.out.printf("Число 1: %d число 2: %d большее из них: : %d", a,b, getMaxNum(a,b) );
        System.out.println("большее из чисел 24 или "+a+"это число" + getMaxNum(24,a));
        System.out.println(getMaxNum(23+54, 65+12+1));

        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите второе число");
        a = scanner.nextInt();
        System.out.println("Введите второе число");
        b = scanner.nextInt();
        int result = getMaxNum(b, a);
        System.out.printf("Число 1: %d число 2: %d большее из них: : %d", a, b, result );


        System.out.println(getDayOfWeek(1));
        System.out.println(getDayOfWeek(7));
        System.out.println(getDayOfWeek(2));
        System.out.println(getDayOfWeek(0));
        System.out.println(getDayOfWeek(10));
    }
        // найти большее число из двух
        public static int getMaxNum (int num1, int num2){
        return (num1>num2)? num1: num2; //тернарный оператор
    }
    //найти большее число из трех
        public static int getMaxNum (int num1, int num2, int num3){
        return getMaxNum(getMaxNum(num1, num2), num3);//число из второго метода и два числа из второго метода,
            // сравненных в первом методе, повторно сравниваем с помощью первого метода и получаем

    }


        public static String getDayOfWeek (int dayNum){
            if (dayNum>7 || dayNum<1) {
                return "error";
            }
            switch (dayNum){
                case 1: return "понедельник";
                case 2: return "вторник";
                case 3: return "среда";
                case 4: return "четверг";
                case 5: return "пятница";
                case 6: return "субота";
                case 7: return "воскресенье";
            }
            return "";
    }
}