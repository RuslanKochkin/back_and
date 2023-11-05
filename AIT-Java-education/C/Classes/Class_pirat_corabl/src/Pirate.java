public class Pirate {
    String name;
    int age;
    int numberOfLegs;
    Pirate (String name, int age, int numberOfLegs){
        this.name = name;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
    }
    public String toString(){
//        return name + "." + age + ". " + numberOfLegs +".";
        return String.format("Пират %s,%d, Лет%d", name, age, numberOfLegs);
    }
}
