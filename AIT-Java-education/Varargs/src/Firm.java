import java.util.Comparator;

public class Firm implements Comparator<Firm> {
    protected String name;
    protected int employees;
    Firm (String name,int employees){
        this.name = name;
        this.employees = employees;
    }
    @Override
    public int compare(Firm o1, Firm o2) {
        if (employees == o1.employees){
            return name.compareTo(o1.name);
        }
        return Integer.compare(employees, o1.employees);
    }
}
//Создайте класс Firm - фирма c полями:
//
//название
//количество сотрудников
//Создайте TreeSet фирм, добавьте в него произвольное количество фирм, убедитесь, что все несовпадающие фирмы добавились.
//
//Попробуйте добавить полей в класс Firm, после чего создайте еще один TreeSet с использованием Comparator.