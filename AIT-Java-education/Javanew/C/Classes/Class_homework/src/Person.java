public class Person {
    //b. Создайте класс Person со следующими атрибутами String firstName, String lastName, MyDate birtday.
    // Напишите методы конструктор, toString.
    String firstName;
    String lastName;
    MyDate birthday;
    Person(String firstName, String lastName, MyDate birthday){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }
    public String toString(){
        return firstName + "-" + lastName + " " + birthday;
    }
}
