package S.skaner1.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Какой у Вас вес: ");
        double weight = scanner.nextDouble();

        System.out.print("Введите Возраст: ");
        int age = scanner.nextInt();

        System.out.print("Введите Пол: ");
        scanner.nextLine();
        String floor = scanner.nextLine();

        System.out.print("Количество дитей: ");
        int kids = scanner.nextInt();

        System.out.print("Месячный доход: ");
        int income = scanner.nextInt();
        int income1 = income * 12;

        System.out.println(name + ", " + weight + " кг, " + age + " лет, " + floor + " Пол, " + "\nКоличество дитей: "   + kids +
                 ",Годовой доход: " + income1 + "Euro.");


    }
}