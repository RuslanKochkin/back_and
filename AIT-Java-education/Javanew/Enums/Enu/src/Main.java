import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        dayOfWeekHandler(DaysOfWeek.FRIDAY); //вызываем метод передавая день недели
//        dayOfWeekHandler(DaysOfWeek.MONDAY);
//        System.out.println("Печатает весь список");

       DaysOfWeek[] all = DaysOfWeek.values();// получаем массив из всех обьектов
        for (DaysOfWeek day: all){             // набрали обькты в массив day
            System.out.println(day.name());
        }
        System.out.println(Arrays.toString(all));//печать массива через класс Array
        DaysOfWeek monday = DaysOfWeek.valueOf("MONDAY");
        System.out.println("Ввод дня");
        DaysOfWeek inputedDay = inputDayOfWeek();
        System.out.println(inputedDay);
    }
    public static void dayOfWeekHandler(DaysOfWeek day){ //Метод вызова Enum
        System.out.println(day.name());//можно так
        System.out.println(day);// а можно так
        System.out.println(day.getRuName());
        DaysOfWeek sunday = DaysOfWeek.SUNDAY;// пример обьявления переменной типа DayOfWeek

        if (day.equals(sunday)){
            System.out.println("Ура выходной");
        }
    }
    public static DaysOfWeek inputDayOfWeek(){
        Scanner scanner=new Scanner(System.in);
        DaysOfWeek[]days = DaysOfWeek.values();
        System.out.println("Введите день недели: " + Arrays.toString(days)+ " : ");
        String str = scanner.nextLine();
        str= str.toUpperCase();
        return DaysOfWeek.valueOf(str);

    }
}