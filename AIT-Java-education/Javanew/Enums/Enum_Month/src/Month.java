//Реализуйте enum Month с перечислением всех месяцев.
//Реализуйте enum Season с названием сезонов (WINTER, SPRING, SUMMER, AUTUMN)
//Напишите метод, который принимает Month, а соответствующий возвращает Season
//Добавьте в enum Month поле, с названием месяца по-русски, и поле номер месяца. Сделайте соответствующий конструктор.
//Реализуйте метод, который распечатает все месяцы строками вида „Месяц 1 – январь”, „Месяц 2 – февраль” ……
public enum Month {
    JANUARY(1, "Январь"), FEBRUARY(2, "Февраль"), MARCH(3, "Март"), APRIL(4, "Апрель"), MAY(5, "Май"), JUNE(6,"Июнь"),
    JULY(7, "Июль"), AUGUST(8, "Август"), SEPTEMBER(9, "Сентябрь"), OCTOBER(10, "Октябрь"), NOVEMBER(11, "Ноябрь"),
    DECEMBER(12, "Декабрь");
    int numberOfMonth;
    String ruName;

    Month(int numberOfMonth, String ruName) {
        this.numberOfMonth = numberOfMonth;
        this.ruName = ruName;

    }
        public String toString(){
        return "Месяц "+ numberOfMonth +"-"+ ruName;
    }
}
