
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
//Реализуйте взаимосвязь между стажем и размером получаемой зарплаты. Придумайте свои методы.

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Firm venik = new Firm("Veniki russia", new LinkedList<Employee>());
        venik.addEmployees(new Employee("vladimir ", " putin ", 1, 0));
        venik.addEmployees(new Employee("cactam_ego ", "pescov ", 10, 0));
        venik.addEmployees(new Employee("vladimir ", " lenin ", 21, 0));
        venik.paySelaryToAll();
        System.out.println(venik);
    }
}