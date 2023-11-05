import java.util.Arrays;

////Реализуйте enum Month с перечислением всех месяцев.
////Реализуйте enum Season с названием сезонов (WINTER, SPRING, SUMMER, AUTUMN)
////Напишите метод, который принимает Month, а соответствующий возвращает Season
////Добавьте в enum Month поле, с названием месяца по-русски, и поле номер месяца. Сделайте соответствующий конструктор.
////Реализуйте метод, который распечатает все месяцы строками вида „Месяц 1 – январь”, „Месяц 2 – февраль” ……
public class Main {
    public static void main(String[] args) {
        Month[] all = Month.values();
        Season[] all1 = Season.values();
        System.out.println(Arrays.toString(all));
        Season december = whichSeason(Month.DECEMBER);
        System.out.println(december);

    }

    public static Season whichSeason(Month which) { //Метод вызова Enum
        Season winter = Season.WINTER;
        Season spring = Season.SPRING;
        Season summer = Season.SUMMER;
        Season autumn = Season.AUTUMN;
        if (which.equals(Month.JANUARY) || which.equals(Month.FEBRUARY) || which.equals(Month.DECEMBER)){
            return winter;
            }
        if (which.equals(Month.MARCH) || which.equals(Month.APRIL) || which.equals(Month.MAY)){
            return spring;
        }
        if (which.equals(Month.JUNE) || which.equals(Month.JULY) || which.equals(Month.AUGUST)){
            return summer;
        }
        return autumn;
    }
}
