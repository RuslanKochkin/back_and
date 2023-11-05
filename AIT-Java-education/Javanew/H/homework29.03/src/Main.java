import java.util.Locale;

public class Main {
    //Задача 1
    //Создайте метод, который ничего не принимает в качестве параметров, выводит в консоль:
    // "Кажется я начинаю понимать".
    //
    //Назовите этот метод understand. Вызовите метод внутри main.
    //
    //Задача 2
    //Создайте метод c именем powOfThree, метод принимает int, возвращает int.
    // Пусть метод возводит число в третью степень. Вызовите метод в main.
    //
    //Задача 3
    //Создайте метод, который принимает в качестве параметра String - возвращает новый String.
    //Пусть метод переводит первые три символа в upper case (верхний регистр),
    // а все остальные символы в lower case (нижний регистр). Назовите метод firstToUpper.
    public static void main(String[] args) {
        hiAlicher();
        System.out.println(powOfTree(3));
        System.out.println(firstToUpper("Какие то проблемы"));
        System.out.println(firstToUpper("Все замечательно"));


    }
    public static void hiAlicher() {
        System.out.println("Кажется я начинаю понимать");
    }
    public static int powOfTree(int ofTree) {
        return ofTree * ofTree * ofTree;

    }
    public static String firstToUpper(String str) {
        return str.substring(0, 3).toUpperCase() + str.substring(3).toLowerCase();
    }
}