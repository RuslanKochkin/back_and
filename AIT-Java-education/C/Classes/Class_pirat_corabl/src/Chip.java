import java.util.LinkedList;

public class Chip {
    String title;
    Pirate captain;
    LinkedList<Pirate> crew;
    Chip(String title, Pirate captain, LinkedList<Pirate> crew){
        this.title = title;
        this.captain = captain;
        this.crew = crew;
    }
    public String toString(){
        return  title + captain + crew;

    }
    public void addCrewMember(Pirate pirate){
        crew.add(pirate); //добавили пирата в лист
    }
}
