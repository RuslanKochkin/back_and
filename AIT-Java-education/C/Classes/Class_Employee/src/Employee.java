//Создайте класс работник Employee с полями:
//имя;
//фамилия;
//стаж (лет);
//дожность;
//double moneyAccount; Создайте для этого класса toString и конструктор.
//Создайте класс фирма с полями:
//название;
//работники LinkedList<Employee> employees;
//Создайте для этого класса toString и конструктор.
//Создайте в классе фирма метод public void paySelaryToAll() -
// этот метод должен увеличивать количество денег на счету у каждого сотрудника на 3000;

public class Employee {
    String name;
    String surname;
    int jobTitle;
    double moneyAccount;

    Employee(String name, String surname, int jobTitle, double moneyAccount) {
        this.name = name;
        this.surname = surname;
        this.jobTitle = jobTitle;
        this.moneyAccount = moneyAccount;
    }

    public String toString() {
        return String.format("%s %s опыт: %d на счету: %.2f", name, surname, jobTitle, moneyAccount);
    }

    public void incomeTransaction(double amout) {
        moneyAccount = moneyAccount + amout;
    }
}
