public class Account {
    //Дан список объектов Account. Каждый Account содержит 3 поля
    // String iban – номер счета, String nameOfOwner – имя владельца,
    // double balance – баланс счета.
    // Необходимо создать map в котором ключем будет имя владельца счета а значением его Account.
    int iban;
    String nameOfOwner;
    double balance;
    Account(int iban, String nameOfOwner, double balance){
        this.iban = iban;
        this.nameOfOwner = nameOfOwner;
        this.balance = balance;
    }
    public String toString(){
        return iban + " : " + nameOfOwner + " : " + balance;
    }
}
