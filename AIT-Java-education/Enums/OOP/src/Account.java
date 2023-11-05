package Enums.OOP.src;

public class Account {
    private Person person;
    private String str;
    public double balans;
    private double persent;

    public Account(Person person, String str, double aDouble) {
        this.person = person;
        this.str = str;
        this.balans = aDouble;
    }

    public double getBalans() {
        return balans -1000;
    }
    public void setBalans(double balans){ //Метод который осуществляет доступ к приватному полю
        if(this.balans > 0) {
            this.persent = this.persent + 1;//добавили процент
            this.balans = this.balans - 1;//забрали из баланса
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "person=" + person +
                ", str='" + str + '\'' +
                ", aDouble=" + balans +
                '}';
    }
}
