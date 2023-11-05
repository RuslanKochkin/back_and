package Enums.OOP.src;

public class Person {
    String name;
    int age;
    String auto;

    Person(String name, int age, String auto){
        this.name = name;
        this.age = age;
        this.auto = auto;
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
        this.auto = "";
    }


    public String toString(){
        return name + " " + age + " " + auto;
    }
    public void sayHello(){
        System.out.println("Hello! I am " + name);
    }
}
