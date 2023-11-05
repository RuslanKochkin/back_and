import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = "Apple is my favourite of 10 others fruits";
        System.out.println(text);
        String text1 = text.replaceAll("^\\w+()", "Orange");
        System.out.println(text1);
        String text2 = text.replaceAll("\\w+()$", "vegetables");
        System.out.println(text2);
        String text3 = text.replaceAll("\\d+()", "many");
        System.out.println(text3);
        List<String> text4 = Arrays.asList(text.split(" "))
                .stream().map(text5->
                        new String(text5.replaceAll("\\b\\w{2}\\b", "@@"))).toList();
        System.out.println(text4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        boolean text5 = scanner.nextLine().matches("\\w+\\s+\\d+\\s+\\w+!$");
        System.out.println(text5);
    }


}
//Дана строка "Apple is my favourite of 10 others fruits".
//
//Задание 1
//Замените любое первое слово на Orange.
//
//Задание 2
//Замените любое последнее слово на "vegetables".
//
//Задание 3
//Замените цифры на слово many.
//
//Задание 4 map
//Замените все слова из двух букв на "@@"
//
//Задание 6
//Пользователь вводит текст в консоль. Проверьте правильный ли текст он вводит.
// Текст должен быть такой: несколько латинских букв, потом несколько цифр,
// потом несколько латинских букв и заканчивается на !
//Дополнительно выведите в консоль цифры из тех, что он ввел.