public class VineBottle {
    public String title;
    public static double volume;//пример статического поля которое делает для всех обьектов одинаковое значения(синхронизация)

    public VineBottle(String title) {
        this.title = title;

    }
    public static void statikPrint(){
        System.out.println("Я статический метод");
        //в нутри статического нельзя исп слова this super
        //мы не можем обр к нестатическим полям
        //можем ссылатся только на другие статические методы / nonStatikPrint1 - работать не будет
    }
    public  void nonStatikPrint1(){
        System.out.println("Я статический метод");//а в нестатических можем обр к любым полям

    }

    @Override
    public String toString() {
        return "VineBottle{" +
                "title='" + title + '\'' +
                ", volume=" + volume +
                '}';
    }
}
