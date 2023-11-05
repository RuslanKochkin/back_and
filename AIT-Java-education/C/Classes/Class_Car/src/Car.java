public class Car {
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
    String brand;
    int horsePowers;
    boolean electric;
    Car (String brand, int horsePowers, boolean electric){
        this.brand = brand;
        this.horsePowers = horsePowers;
        this.electric = electric;

    }
    public String toString(){
        return brand + " " + horsePowers + " " + electric;
    }
    public void drive(){
        System.out.println(brand + " " + (electric?"eco_car":"это плохо"));
    }

}
