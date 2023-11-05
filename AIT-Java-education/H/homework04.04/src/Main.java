import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        System.out.println(indexOf("Java is the best", n));// -> 5
//        System.out.println(substringOn("Java is the best", 1, 20));
    }
    //Задание 1
    //Напишите метод indexOf, который возвращает индекс заданного символа в заданной строке. Т.е.
//     метод принимает строку и char и возвращает позиуию, где этот символ первый раз встречается в строке.
    //Если в заданной строке нет заданного символа, то метод должен вернуть -1.
    //Примеры: indexOf("Java is the best", 'i') -> 5
    //indexOf("Java is the best", 'q') -> -1
    //indexOf("Java is the best", 'a') -> 1
    //Естественно, в рамках этой задачи нельзя использовать стандартный indexOf класса String

    public static int indexOf(String str, int symbol){

        for (int i = 0; i < str.length(); i++ ){
            if (str.charAt(i)==symbol){
                return i;
            }
        }
        return -1;
//        (str1.length()>str2.length())? str1.length():str2.length();

    //------------------------------------------------------------------------------------------
    //Задание 2
    //Реализовать свой метод substring(). Т.е в метод приходит строка и два целых числа index1 и index2.
    //Метод возвращает подстроку, начиная с символа в позиции index1 до символа в позиции index2.
    //Причем символ в позиции index1 включаем в результат а символ в позиции index2 не включаем.
    //Если даны "ошибочные параметры", например index2<=index1 или один из индексов не попадает в строку,
    // метод должен возвращать пустую строку
    //Примеры:
    //substring("Java is the best", 0, 4) -> "Java"
    //substring("Java is the best", 1, 6) -> "ava is"
    //substring("Java is the best", 1, 60) -> ""
    //substring("Java is the best", 8, 8) -> ""
    //Естественно, в рамках этой задачи нельзя использовать стандартный substring класса String
//        public static String substringOn(String str, int index1, int index2){
//            if (index2<=index1 || index2 > str.length()-1){
//                return "";
//        }
//            if (index1 < 0 ||index2 > str.length()-1 || index2 < 0){
//                return "";
//            }
//            String acc = "";
//            for (int i = index1; i < index2; i++){
//                acc+=str.charAt(i);
//            }
//        return acc;
    }
}
//    public static void print2(String word){
//        for(int i=0; i < word.length(); i+=2 ){ // i= 0... 2....4.....6...
//                char ch = word.charAt(i);
//                System.out.print(ch);




//          Дана строка. Реализовать метод, который выводит на экран
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

//          public static String getString(String word){
//        String result="";
//        for(int i=0; i<word.length(); i+=2){
//            result+= word.charAt(i);  // result=result+word.charAt(i);
//        }
//        return result;
//    }

