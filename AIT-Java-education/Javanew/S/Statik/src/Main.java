import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        VineBottle cianty = new VineBottle("Cianty");
        VineBottle ciantynew1 = new  VineBottle("Cianty1");
        cianty.volume = 1.0;

        System.out.println(cianty);
        System.out.println(ciantynew1);
        VineBottle.volume = 2.3;//к статическим полям нужно обращатся через имя класса и можно менять значения поля/блока/метода
        System.out.println(cianty);
        System.out.println(ciantynew1.volume);//передаем значения статического поля
        VineBottle.statikPrint();// статическмй вызываем от имени обьекта/в нутри статического нельзя исп слова this super
        cianty.nonStatikPrint1();// статическмй вызываем от имени обьекта

        String[] names = new String[]{"Vasya", "Petya", "Sasha"};
        ArrayTools.print(names);  // вызвали статический метод класса, который сами и создали
        System.out.println(Arrays.toString(names)); // вызвали статический метод класса, который кто-то написал за нас

    }
}