import java.util.Objects;

//Создать класс Account (String iban, Person owner, double balance). Создать список счетов.
//Написать метод, который формирует Map< Account, Person>, где ключом является счет Account,
// а значением Person владелец счета.
public class Acaunt {
    private String iban;
    private Person owner;
    private double balance;

    public Acaunt(String iban, Person owner, double balance) {
        this.iban = iban;
        this.owner = owner;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Acaunt{" +
                "iban='" + iban + '\'' +
                ", owner=" + owner +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acaunt acaunt = (Acaunt) o;
        return Objects.equals(iban, acaunt.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban);
    }
}
