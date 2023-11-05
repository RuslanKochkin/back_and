//Представим, что мы создаем программу для автосервиса.
//Создайте класс Car с полями:
//String numberPlate; - это автомобильный номер например "d812ce"
//int gas; - это бензин, например: 98
//brand; - это марка машины
//String owner; - имя владельца
//String telephone; - номер телефона владельца
//Создайте в main словарьHashMap<String, Car>
//Тип ключа string - это номер знака "d812ce".
//Тип значения - это Car.
//Заполните словарь парами ключ-значение

import java.util.HashMap;
import java.util.Map;

//Создайте в классе Main метод public static void printCarInfo(HashMap<String, Car> carsMap)
//
//Метод должен спрашивать у клиента номер автомобиля
//Метод должен выводить в консоль информации про этот автомобиль в следующем виде:
// Машина марки <brand> с собственником <owner> с телефоном <telephone>, бензин: <gas>
//Вызовите метод
public class Car {
    String numberPlate;//номер
    int gas;//марка бензина
    String brand;
    String owner;//владелец
    String telephone;

    Car(String numberPlate, String brand, String owner, String telephone, int gas) {
        this.numberPlate = numberPlate;
        this.brand = brand;
        this.owner = owner;
        this.telephone = telephone;
        this.gas = gas;
    }

    public String toString() {
        return brand + ";" + owner + ";" + telephone + ";" + gas;
    }

    public static void printCarInfo(HashMap<String, Car> carsMap) {
        for (Map.Entry entry : carsMap.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                System.out.println(entry);
            }
        }
    }
}
