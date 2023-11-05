import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
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
//Создайте в классе Main метод public static void printCarInfo(HashMap<String, Car> carsMap)
//Метод должен спрашивать у клиента номер автомобиля
//Метод должен выводить в консоль информации про этот автомобиль в следующем виде:
// Машина марки <brand> с собственником <owner> с телефоном <telephone>, бензин: <gas>
//Вызовите метод
    public static void main(String[] args) {

        HashMap<String, Car> catalogClients = new HashMap<>();
        catalogClients.put("0127", new Car( "0127", "Slavyta", "Ruslan", "0993016040", 95 ));
        catalogClients.put("0000", new Car( "0000", "Pegeot", "Ruslan", "0997234567", 95 ));
        printCarInfo(catalogClients);

    }
    public static void printCarInfo(HashMap<String, Car> carsMap){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер: ");
        String number = scanner.nextLine();
        for(Map.Entry entry: carsMap.entrySet()){
            if (entry.getKey().equals(number)){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
//        // Map.Entry entry - текущий объект - который содержит в себе ключ и значения
//        // .entrySet() - возвращает множество entries
//        // map - в данном случае это просто имя переменной, которую мы сами выбрали
//        for(Map.Entry entry: map.entrySet()){
////            System.out.println(entry);
//            // Entry - это класс у которого есть поля key, value
//            // получаем из entry ключ при помощи метод .getKey()
//            // получаем из entry значение при помощи метода .getValue()
//            System.out.println(entry.getKey() + " : " + entry.getValue());

//    public static void main(String[] args) {
//        Person[] people = {
//                new Person("Иван","Иванов",20),
//                new Person("Василий","Васильев",30),
//                new Person("Евгений","Дятлов",25),
//                new Person("Олег","Шаров",22)
//        };
//        HashMap<String, Person> lNameToPersonMap = new HashMap<>();
//        for (Person person: people){
//            lNameToPersonMap.put(person.lName, person );
//        }
//        System.out.println(lNameToPersonMap);
//        Person person= lNameToPersonMap.get("Иванов");
//        System.out.println(person);

//        HashMap<String, String> lNameTofName = new HashMap<>();
//        for (Person p: people){
//           lNameTofName.put(p.lName, p.fName);