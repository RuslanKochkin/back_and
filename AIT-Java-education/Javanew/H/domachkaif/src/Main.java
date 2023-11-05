package H.domachkaif.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Задание 1
//        Пусть пользователь введет свою температуру: например, 38.8.
//        Если температура больше 39, выведите в консоль фразу:
//         «Нужно срочно обратиться к врачу». Если температура меньше, то выведите фразу: «Лечитесь дома»
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Напишите какая у Вас температура: ");
//        int Temperature = scanner.nextInt();
//        if (Temperature >= 39) {
//            System.out.println("Нужно срочно к врачу");
//        } else {
//            System.out.println("Лечитесь дома");
//        }
//
//        Задание 2
//        Пользователь вводит слово, если слово не начинается на букву ‘Q’, выведите в консоль фразу:
//        «А я уже начал бояться”, в противном случае - «Не повезло».
//        Сохраните результат проверки условия в переменную типа boolean и выведите ее в консоль.
//
//        Scanner scanner2 = new Scanner(System.in);
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
//        }



        //        // тип булиан имеет только два значения true или false
//        //в переменную булиан мы можем сохранить результат проверки какого либо условия
//        boolean b1 = 5>16;
//        System.out.println(b1); //false
//        if (b1){
//            System.out.println("Boom")


        //---------------------------------------------------------------------------------

        // != если не равно
//        // == != мы можем использовать с премитивными типами
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Сколько слово: ");
//        String answer = scanner2.nextLine();
//        char first = answer.charAt(0);
//        if ( first  == 'A') {
//            System.out.println("горече");
//        }
//        if (answer.length() == 8){
//            System.out.println("нужная длинна");
//        }
//        // тип булиан имеет только два значения true или false
//        //в переменную булиан мы можем сохранить результат проверки какого либо условия
//        boolean b1 = 5>16;
//        System.out.println(b1); //false
//        if (b1){
//            System.out.println("Boom");
        //---------------------------------------------------------------------------------
//        Задание 2
//
//        Пользователь вводит слово, если слово не начинается на букву ‘Q’, выведите в консоль фразу: «А я уже начал бояться”, в противном случае - «Не повезло».
//        Сохраните результат проверки условия в переменную типа boolean и выведите ее в консоль.
//     */
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Введите слоово: ");
//            String word = scanner.nextLine();
//            char first=word.charAt(0); // первый символ в строке word
//            boolean answer= first!='Q';
//            if (answer){
//                System.out.println("А я уже начал бояться");
//            }  else {
//                System.out.println("Не повезло");
//            }
//            System.out.println(answer);
//        }
//    }
        //---------------------------------------------------------------------------------
//    от Andrey Belov для Все (23 марта 2023 г., 12:20)
//    public class Main {
//        public static void main(String[] args) {
//            int a=10;
//            String str="дождь";
//            String str1=str.toUpperCase();
//            String str2="ДОЖДЬ";
//            // при сравнение строк == использовать нельзя
//            if(str1.equals(str2)){    // правильное сравнение строк на равенство
//                System.out.println("Привет!");
//            }
//            System.out.println(str1);
        //---------------------------------------------------------------------------------
//        b. Если после DE следует "2334" (это значение должно быть заданно в программе как переменная) программа должна выдать сообщение:
//        "счет клиента №923291 в нашем банкке" ( №923291 - оставшиеся цифры счета).
//        Если после DE следует что то другое, то программа должна выдать сообщение "введенный счет из другого филиала"
//        Например:
//
//        DE2334923291 -> счет клиента №923291 в нашем банкке
//        G2334923291 -> некорректный номер счета
//        DE23349232916843 -> некорректный номер счета
//        DE5554923291 -> введенный счет из другого филиала
//
//        }
//    }


    }
}