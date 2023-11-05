public class Main {
    public static void main(String[] args) {
//Создайте класс Car с полями:
//brand;
//horsePowers - сколько лошадиных сил;
//boolean isElectric; - электрическая ли машина.
//Внутри класса создайте конструктор и toString.
//
//Создайте еще один метод drive.
//Метод должен выводить в консоль фразу "Zzzzz", - если машина электрическая,
// фразу "Brr-brr-brr", если машина не электрическая.
//
//Создайте несколько объектов-машин, вызовите метод drive.
        Car tesla = new Car("tesla", 150, true );
        Car volkswagen = new Car("volkswagen", 150, false );
        Car reno = new Car("reno", 150, false );
        Car zoy = new Car("zoy", 150, true );
        zoy.drive();
        volkswagen.drive();



    }
}