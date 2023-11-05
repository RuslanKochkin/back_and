public class Account {
    //с. Создайте класс Account со следующими атрибутами: String IBAN (номер счета), Person owner (владелец),
    // double balance (баланс), MyDate dayOpen (дата открытия счута) Напишите метод конструктор, toString.
    //Создайте несколько счетов, создайте массив из счетов, распечатайте список счетов.
    String iban;
    Person owner;//(владелец),
    double balance;
    MyDate dayOpen;//(дата открытия счета)
    Account(String iban, Person owner, double balance, MyDate dayOpen){
        this.iban = iban;
        this.owner = owner;
        this.balance = balance;
        this.dayOpen = dayOpen;
    }
    public String toString(){
        return " Номер счета; "+ iban + ". владелец; " + owner + ". баланс; " + balance + ". Дата открытия; " + dayOpen;
    }
    public void incomeTransaction(double amout){
        balance=balance + amout;
    }
}
