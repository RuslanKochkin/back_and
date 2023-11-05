public class Main {
    public static void main(String[] args) {
        Alcogol vodka = new Alcogol("vodka", 0.5, 40);
        Alcogol vine = new Alcogol("vodka", 0.5, 18);
        SoftDrink orange = new SoftDrink("orange", 1, 20);
        SoftDrink tomato = new SoftDrink("tomato", 1, 2);
        System.out.println(vodka);
        System.out.println(vine);
        System.out.println(orange);
        System.out.println(tomato);



    }
}