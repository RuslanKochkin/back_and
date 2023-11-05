import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Ruslan", "Ivanov", 40 ),
                new Person("Ruslan", "Petrov", 45 ),
                new Person("Gadya", "lilia", 30 ),
        };
        HashMap<String, Person> lNameToPersonMap = new HashMap<>();
        for (Person person: people){
            lNameToPersonMap.put(person.lName, person);
            lNameToPersonMap.get("Ivanov");
        }
        Person person = lNameToPersonMap.get("Ivanov");
        System.out.println(person);
        //-------------------------------
    }
}