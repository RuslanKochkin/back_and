package Enums.OOP.src;

public class Main {
    public static void main(String[] args) {
        Person jack = new Person("Jack", 40);
        Person ann = new Person("anna", 40, "ford");
        ann.sayHello();
        System.out.println(jack);
        System.out.println(ann);

        Account account = new Account(jack, "DE12345", 10000 );
        System.out.println(account);
        account.balans = -10;
        System.out.println(account);

        System.out.println(account.getBalans());
        account.setBalans(20000);
        System.out.println(account);
    }
}