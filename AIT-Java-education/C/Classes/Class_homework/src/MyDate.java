public class MyDate {
// а. Создайте класс MyDate со следующими атрибутами (int day, int month, int year).
// Напишите метод конструктор и toString
    int day;
    int month;
    int year;
    MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year= year;
    }
    public String toString (){
        return day + "-" + month + "-" + year;
    }
}
