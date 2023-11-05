public class Main {
    public static void main(String[] args) {
//        System.out.println(multiplyString("Зачем взламывать мозг", 3));
//        System.out.println(getSum());
        print("java");

    }

    //-------------------------------- метод акамулятор----------------------------------------
//    public static int getSum() {
//        int sum = 0;
//        for (int i = 1; i <= 120; i++) {
//            sum = sum + i;
//        }
//        return sum;
//    }
//Задание 2
//Создайте метод multiplyString, который принимает:
//
//String word - слово;
//int n - количество повторений.
//Метод возвращает тип String, слово повторенное n раз.
//Пример вызова метода:
//
//multiplyString("apple", 3); --> "appleappleapple"
//multiplyString("cat_", 7); --> "cat_cat_cat_cat_cat_cat_cat_"
//P.S. Используйте цикл, а не метод repeat
//public static String multiplyString(String str, int a){
//        String accumulator = "";

//        for (int i = 0; i < a; i++) {
//            accumulator = accumulator + str;
//        }
//        return accumulator;
//    }
//}

    //Напишите метод, который возвращает сумму чисел
    // от - 100 до -200. Метод не принимает никаких параметров. И ничего не выводит в печать.
//    public static int getSum() {
//        int sum = 0;
//        for (int i = -200; i <= -100; i++) {
//            sum = sum + i;
//        }
//        return sum;


    public static void print(String msg) {
        int i = 0;
        while (i < msg.length()) {
            char ch = msg.charAt(i);
            System.out.println(ch);
            i++;
//        for (int i = 0; i < msg.length(); i++) {
//            System.out.println(msg.charAt(i));  // j...  a...  v... a..
//        }

        }
    }
}
// Дана строка. Реализовать метод, который выводит на экран
//            только буквы стоящие на четных позициях в этой строке.
//
//            "java is very popular" -> "jv s vr pplr"
//            "012345678" -> "02468"
//         */
//        print("012345678");
//        print("java is very popular");
//        System.out.println(getString("java is very popular"));
//
//    }
//    public static void print(String word){
//        for(int i=0; i < word.length(); i++ ){
//            if(i%2==0) {
//                char ch = word.charAt(i);
//                System.out.print(ch);
//            }
//        }
//        System.out.println();
//    }









