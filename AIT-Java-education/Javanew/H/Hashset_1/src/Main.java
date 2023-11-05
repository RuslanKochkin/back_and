import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<String> nameSet = new HashSet<>();//нет индекса и порядка у обьектов
        nameSet.add("Hasan");//у хешсета беспорядочное добовление обьектов
        nameSet.add("Ruslan");
        System.out.println(nameSet);
        nameSet.add("Ruslan");// невозможны дубликаты в хешсете
        System.out.println(nameSet);

        nameSet.remove("Hasan");// метод удоления
        nameSet.size();// метод показывает количество обьектов
        nameSet.contains("igor"); //метод ищет обьект если обьект есть тру/нет фолс
        //-----------------------------------------------
// Спрашиваем у пользователя сколько он хочет ввести имен.
//        // После этого получаем от него имена через сканер.
//        // После этого выведите на экран количество уникальных элементов.
//        // То есть ответ на вопрос, сколько из этих имен было уникальных?
//        // "Количество уникальный имен: <количество>"

        System.out.println("Сколько вы хотите ввести имен: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        HashSet<String>  uniguiNames = new HashSet<>();
        for (int i = 0; i < number; i++) {
            System.out.println("Введите имя:№" + (i+1));
            uniguiNames.add(scanner.nextLine());
        }
        System.out.println("Количество уникальных имен" + uniguiNames.size());
        //---------------------------------метод передавания обьектов для выделения уникальных и обратно-----------------------------------------
        ArrayList<String> words = new ArrayList<>(List.of("apple", "apple","orange"));
        HashSet<String> unigueWords = new HashSet<>(words);
        System.out.println(unigueWords);

        ArrayList<String> unigueList = new ArrayList<>(unigueWords);
    }
//Метод принимает лист и возврощает количество уникальных обьектов -------------------------------------------
    public static int getNambers (ArrayList<String> coins) {
        HashSet<String> coinsSet = new HashSet<>(coins);
        return coinsSet.size();
    }
    // Метод принимает обьект с листа и выдают уникальный список----------------------------------------------
    public static ArrayList<String> getUnicsCoins(ArrayList<String> array) {
        HashSet<String> unigueCoins = new HashSet<>(array);
        ArrayList<String> unigueCoin = new ArrayList<String>(unigueCoins);
        return unigueCoin;
    }

}

