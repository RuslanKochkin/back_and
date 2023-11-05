import java.util.LinkedList;

//Создайте класс фирма с полями:
//название;
//работники LinkedList<Employee> employees;
//Создайте для этого класса toString и конструктор.
//Создайте в классе фирма метод public void paySelaryToAll() -
// этот метод должен увеличивать количество денег на счету у каждого сотрудника на 3000;
public class Firm {
    String title;
    LinkedList<Employee> employees;

    Firm(String title, LinkedList<Employee> employees) {
        this.title = title;
        this.employees = employees;
    }
    public String toString() {
        return title + "." + employees;
    }

    public void addEmployees(Employee worker) {
        employees.add(worker);
    }

    public void paySelaryToAll() {
        for (int e = 0; e < employees.size(); e++) {
            int jobTitle = employees.get(e).jobTitle;
            switch (jobTitle) {
                case 1: case 2: case 3: case 4: case 5:
                    employees.get(e).incomeTransaction(3000);
                    break;
                case 6: case 7: case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15:
                    employees.get(e).incomeTransaction(3000 * 1.1);
                    break;
                case 16: case 17: case 18: case 19: case 20:
                    employees.get(e).incomeTransaction(3000 * 1.2);
                default:
                    employees.get(e).incomeTransaction(3000 * 1.3);
                    break;
            }
        }
    }
}
//            if(employees.get(e).jobTitle >= 15){
//                employees.get(e).incomeTransaction(3000 * 1.15);

//java.util.ArrayList<String> futureMonths = new java.util.ArrayList<String>();
//
//int month = 8;
//
//switch (month) {
//case 1:
//	futureMonths.add("January");
//case 2:
//	futureMonths.add("February");
//case 3:
//	futureMonths.add("March");
//case 4:
//	futureMonths.add("April");
//case 5:
