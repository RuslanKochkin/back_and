import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Pirate ruslan = new Pirate("Ruslan", 40, 2);
        Pirate irina = new Pirate("irina", 29, 2);
        Pirate rostik = new Pirate("Rostik", 40, 2);
        LinkedList<Pirate> initialCrew = new LinkedList<>();// создали пустой лист

        Chip franko = new Chip("Hohland :", ruslan, initialCrew);// создали корабль с пустым листом
        System.out.println(franko);
        franko.addCrewMember(irina);
        franko.addCrewMember(rostik);
        System.out.println(franko);
    }
}