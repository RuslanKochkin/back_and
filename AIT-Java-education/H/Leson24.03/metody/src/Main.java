
public class Main {
    public static void main(String[] args) {
        //----------------------------Методы---------------------------------------------
        // Методы
        //-могут преобразовывать значения
        // обьявление метода по логике или преобразованию
        //значение [B
        hello(); // внутри предыдущего метода main
        robbery();
        //вызываем новый метод в переменной
        int result = addFive(100);
        System.out.println(result);
        System.out.println(division(33, 2));
        System.out.println(sum(33, 2));
    }

    public static int addFive(int number) {
        return number + 5;
    }

    public static void hello() {
        System.out.println("Добрый день");
        System.out.println("Как ваши дела");

//      robbery(); //методы можно вызывать из методов

    }

    public static void robbery() {
        hello();
        System.out.println("Это ограбление поэтому деньги в мешок");
        System.out.println("Если будете делать как надо никто не постродает");
    }

    public static double division(double b1, double b2){
        return b1 / b2;
        }
    public static int sum(int b3, int b4){
        return b3 + b4;
    }
    public static String cut(String b5){
        return b5.substring(0, 4)+"...";
    }
    // объявите метод с именем multiplyByEight,
    // метод возвращает тип int
    // метод принимает тип int
    // метод должен умножать значение на 8
    // вызовите метод в main два раза с разными аргументами
    public static int multiplyByEight(int number){
        return number * 8;
    }

    }

