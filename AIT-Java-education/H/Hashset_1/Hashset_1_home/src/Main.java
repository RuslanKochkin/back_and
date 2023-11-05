import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //---------------------------------------------
        HashSet<Integer>set = createSetFromConsole();
        System.out.println(set);
        set = remove(set);
        System.out.println(set);
        //----------------------------------------------------------------------------------------
//    //Нужно создать множество. Сделать сканер. По одному записывать элементы. Добавлять во множество
//    //Написать программу, которая
//    //прочитает с клавиатуры количество чисел
//    //прочитает с клавиатуры сами числа и соберёт их в множество
//    //удалит из множества числа, большие 10
//    //выведет полученные результаты на экран
//    //Все числа, которые подаются на вход, целые.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько будет чисел : ");
        int number = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> aBunchOf = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            System.out.println("Введите число: " + (i + 1));
            aBunchOf.add(scanner.nextInt());
            for (int a = 0; a < aBunchOf.size(); a++) {
                if (aBunchOf.get(a) > 10) {
                    aBunchOf.remove(a);
                }
            }
            System.out.println(aBunchOf);
        }
    }
    //Создайте метод, который принимает ArrayList, возвращает новый ArrayList,
    // в котором хранятся уникальные значения.
    public static ArrayList<String> getUnics(ArrayList<String> list) {
        HashSet<String> unigueAraayGet = new HashSet<>(list);
        ArrayList<String> unigueGet = new ArrayList<String>(unigueAraayGet);
        return unigueGet;
    }
    //-------------------Метод набора элементов по заданному количеству-------------------------------
    public static HashSet<Integer> createSetFromConsole(){
        HashSet<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int size = scanner.nextInt();
        for (int i = 0; i <=size ; i++) {
            System.out.println("Введите " + i + "'элемент");
            set.add(scanner.nextInt());
        }
        return set;
    }
    //------------ Метод исключающий числа из сета числа больше 10
    public static HashSet<Integer> remove(HashSet<Integer> set){
        HashSet<Integer>temp = new HashSet<>();
        for (Integer i : set){
            if(i>10){
                temp.add(i);
            }
        }
        set.removeAll(temp);
        return set;
    }
    //------------ Метод исключающий числа из сета числа больше 10 вариант второй
    public static HashSet<Integer> remove2(HashSet<Integer> set){
        HashSet<Integer>temp = new HashSet<>();
        for (Integer i : set){
            if(i<=10){
                temp.add(i);
            }
        }
        return temp;
    }
}

