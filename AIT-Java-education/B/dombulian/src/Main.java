package B.dombulian.src;

import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
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


//          Есть прибор у которого есть 2 колбы. В программе дано две переменных,
//          которые содержат температуру каждой колбы. Считается, что прибор работает корректно
//          если температура в одной из колб  меньше 0, а температура друго больше 100;

//        int temp = 5;
//        int temp2 = 150;
//          если температура в одной из колб  меньше 0, а температура друго больше 100;
//        boolean isDeviceCorrect = (temp < 0) & (temp2 > 100) | (temp < 0) | (temp2 > 100);

//        System.out.println("температура переменной: " + temp);
//        System.out.println("температура переменной: " + temp2);
//        if (isDeviceCorrect) {
//            System.out.println("Коректная темп");
//        } else {
//            System.out.println("Не коректная темп");
//        }

//        Задание 1
//
//        Есть прибор у которого есть 2 колбы. В программе дано две переменных,
//        которые содержат температуру каждой колбы (значение для этих переменных можно задат со Scanner,
//        можно просто присвоить значение в программе ).
//        Считается, что прибор работает корректно если разница температуры между колбами не более10градусов
//        и если в одной из колб температура
//        больше 70 градусов.
//                int temp1 = 89;
//                int temp2 = 60;
//                int temp3 = temp1 - temp2;
//                boolean isCorrect = (temp3<=10)&(temp3>=-10) | (temp1 > 70 )&(temp2 > 70);
//                System.out.println(isCorrect);

//        a. Пользователь вводит с клавиатуры IBAN в виде строки (Например так: DE2334923291).
//        Программа проверяет, что счет корректный, т.е.
//        длина составляет 12 символов
//        начинается на "DE"

                Scanner scanner = new Scanner(System.in);
                System.out.println("Ведите ибен");


            }
}
