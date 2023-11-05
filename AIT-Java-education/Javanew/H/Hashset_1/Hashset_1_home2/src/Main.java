import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Даны два списка целых чисел. Посчитайте, сколько чисел содержится одновременно как в первом списке, так и во втором.
//Для каждого списка в программе на вход подаётся сначала количество чисел, а затем и сами числа, каждое в новой строке.
//Используйте множества.
        List<Integer> pisaca1 = new LinkedList<>(spisok());
        System.out.println(pisaca1);
        List<Integer> pisaca2 = new LinkedList<>(spisok());
        System.out.println(pisaca2);
        int arr = pisaca1.size() + pisaca2.size();
        System.out.println(arr);

    }

    public static ArrayList<Integer> spisok() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько будет чисел : ");
        int number = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> aBunchOf = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            System.out.println("Введите число: " + (i + 1));
            aBunchOf.add(scanner.nextInt());
        }
        return aBunchOf;
    }
}