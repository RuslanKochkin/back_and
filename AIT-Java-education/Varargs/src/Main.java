import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, 6, 2);
        LocalDate localDate1 = LocalDate.of(2024, 8, 10);
        LocalDate localDate2 = LocalDate.of(2023, 6, 5);
        Violin violin1 = new Violin("Stradivari", localDate);
        Violin violin2 = new Violin("Suhaya sosna", localDate1);
        Violin violin3 = new Violin("Suhaya", localDate2);

        System.out.println(name(violin1,violin2,violin3));
    }

    public static String name(Violin... violins) {
        Violin oldestViolin = violins[0];
        for (int i = 1; i < violins.length; i++) {
            if (violins[i].getLocalDate().isBefore(oldestViolin.getLocalDate())) {
                oldestViolin = violins[i];
            }
        }
        return oldestViolin.name;
    }
}
//Создайте класс Firm - фирма c полями:
//
//название
//количество сотрудников
//Создайте TreeSet фирм, добавьте в него произвольное количество фирм, убедитесь, что все несовпадающие фирмы добавились.
//
//Попробуйте добавить полей в класс Firm, после чего создайте еще один TreeSet с использованием Comparator.