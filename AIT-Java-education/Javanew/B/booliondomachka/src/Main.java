import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //---------------------------------------------------------------------------------
        //Есть прибор у которог две колбы/ в программе дано две переменные которые содержат температупу
        // каждой/ считается что прибор работает если температура одной меньше 0 а второй более 100
//        int temp = 50;
//        int temp2 = 150;
//        boolean isDeviceCorrect = (temp<50) & (temp2>100);
//        System.out.println("температура переменной: " + temp);
//        System.out.println("температура переменной: " + temp2);
//        if (isDeviceCorrect){
//            System.out.println("Коректная темп");
//        }else {
//            System.out.println("Не коректная темп");

        //---------------------------------------------------------------------------------
//          Есть прибор у которого есть 2 колбы. В программе дано две переменных,
//          которые содержат температуру каждой колбы. Считается, что прибор работает корректно
//          если температура в одной из колб  меньше 0, а температура друго больше 100;
//
//        int temp = 5;
//        int temp2 = 150;
//        boolean isDeviceCorrect = (temp < 0) & (temp2 > 100) | (temp < 0) | (temp2 > 100);
//
//        System.out.println("температура переменной: " + temp);
//        System.out.println("температура переменной: " + temp2);
//        if (isDeviceCorrect) {
//            System.out.println("Коректная темп");
//        } else {
//            System.out.println("Не коректная темп");
////        }
        //---------------------------------------------------------------------------------
//        Задание 1
//        Есть прибор у которого есть 2 колбы. В программе дано две переменных,
//        которые содержат температуру каждой колбы (значение для этих переменных можно задат со Scanner,
//        можно просто присвоить значение в программе ).
//        Считается, что прибор работает корректно если разница температуры между колбами не более10градусов
//        и если в одной из колб температура
//        больше 70 градусов.
                                     //Мое решение----------------------------
//                int temp1 = -10;
//                int temp2 = 71;
//                int temp3 = temp1 - temp2;
//                boolean isCorrect = (temp3<=10)&(temp3>=-10) & ((temp1 > 70 )||(temp2 > 70));
//                System.out.println(isCorrect);
                                     //Алишера решение
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите температуру первой колбы");
//        double temperatureOfFirst = scanner.nextDouble();
//        System.out.println("Введите температуру второй колбы");
//        double temperatureOfSecond = scanner.nextDouble();
//        // если разница температуры между колбами не более 10 градусов
//        // Math.abs - метод - модуль - возвращает абсолютное значение  - без минуса
//        double difference = Math.abs(temperatureOfFirst - temperatureOfSecond); //Math.abs дает абсолютное значение аргумента, простыми словами – мы получаем модуль числа. Аргумент может быть int, float, long, double, short, byte.
//        boolean condition1 = difference <= 10;
//        // и в одной из колб (в любой из двух) температура больше 70 градусов
//        boolean condition2 = temperatureOfFirst > 70 || temperatureOfSecond > 70;
//        // теперь объединим -
//        if (condition1 && condition2) {
//            System.out.println("Работает корректно");
//        } else {
//            System.out.println("Работает не корректно");
//        }
        //---------------------------------------------------------------------------------
//        Задание 2
//        a. Пользователь вводит с клавиатуры IBAN в виде строки (Например так: DE2334923291).
//        Программа проверяет, что счет корректный, т.е.
//        длина составляет 12 символов и
//        начинается на "DE"

//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Ведите IBAN: ");
//        String iben = scanner1.next();
//        char first = iben.charAt(0);
//        boolean b1 = first == 'D';
//        char first2 = iben.charAt(1);
//        boolean b2 = first2 == 'E';
//        boolean b3 = (b1 & b2) && (iben.length() == 12) ;
//        System.out.println(b3);
        //---------------------------------------------------------------------------------
//        b. Если после DE следует "2334" (это значение должно быть заданно в программе как переменная)
//        программа должна выдать сообщение:
//        "счет клиента №923291 в нашем банкке" ( №923291 - оставшиеся цифры счета).
//        Если после DE следует что то другое, то программа должна выдать сообщение
//        "введенный счет из другого филиала"
//        Например:
//
//        DE2334923291 -> счет клиента №923291 в нашем банкке
//        G2334923291 -> некорректный номер счета
//        DE23349232916843 -> некорректный номер счета
//        DE5554923291 -> введенный счет из другого филиала
                                       // Мое решение -------------------------
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Ведите IBEN: ");
//        String iban = scanner2.next();
//        String de = iban.substring(2, 6);
//        String cod = "2334";
//        boolean b3 = (iben.length() != 12);
//        char first = iban.charAt(0);
//        boolean b1 = first == 'D';
//        char first2 = iban.charAt(1);
//        boolean b2 = first2 == 'E';
//        boolean b4 = b1 && b2;
//        if (!b4){
//            System.out.println("некорректный номер счета");
//        }
//        if (de.equals(cod)){
//            System.out.println("счет клиента №: " + iben.substring(6, 12) + " В нашем банке");
//        } else  {
//            System.out.println("введенный счет из другого филиала или Банка");
//        }
//        if (b3){
//            System.out.println("некорректный номер счета");
//        }
                                              // Алишера решение----------------------------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите IBAN");
//        String iban = scanner.nextLine().trim();// trim() - убирает пробелы с начала и конца строки и возвращает обрезанную строку
//        String country = iban.substring(0, 2);
//        boolean hasLengthTwelve = iban.length() == 12;
//        boolean isGerman = country.equalsIgnoreCase("DE"); //Если нужно сравнить строки без учета регистра
//                                                           // , используем equalsIgnoreCase()
//        if (hasLengthTwelve && isGerman) {
//            String department = iban.substring(2, 6);//Поместил переменную во внутрь if для игнорирование в следующих проверки
//            boolean isRightFilial = "2334".equals(department);
//            String clientAccount = iban.substring(6);
//            if (isRightFilial) {
//                System.out.println("счет клиента №" + clientAccount + " в нашем банке");
//            } else {
//                System.out.println("Введенный счет из другого филиала");
//            }
//        } else {
//            System.out.println("Некорректный iban");
//        }


        //---------------------------------------------------------------------------------//
        // Программа на проверку первой букве в слове
        // Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Введите слово: ");
//        String answer = scanner2.nextLine();
//        char first = answer.charAt(0);
//        boolean b1 = first != 'Q';
//        if ( first  == 'Q') {
//            System.out.println("Не повезло");
//        }else {
//            System.out.println("А я уже начал боятся");
//        }if (b1){
//            System.out.println("true");
//        }else {
//            System.out.println("false");

    }
}