import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//    //Дан список объектов Account. Каждый Account содержит 3 поля
//    // String iban – номер счета, String nameOfOwner – имя владельца,
//    // double balance – баланс счета.
//    // Необходимо создать map в котором ключем будет имя владельца счета а значением его Account.
        HashMap<String, Account> accountHashMap = new HashMap<>();
        accountHashMap.put("Ruslan", new Account(1234567890, "Ruslan", 4000));
        accountHashMap.put("Ivan", new Account(123456, "Ivan", 3000));

        System.out.println(accountHashMap);
        System.out.println(accountHashMap);
        print(accountHashMap);

        //    for (Account person : list){
//            accountHashMap.put(person.nameOfOwner, person);
//        }
//        Account person = accountHashMap.get("Ruslan"); //показует акаунт по ключу
//        System.out.println(person);
    }
    //Метод пичати Map и ключа и значения
    public static void print(HashMap<String, Account> map){
        // Map.Entry entry - текущий объект - который содержит в себе ключ и значения
        // .entrySet() - возвращает множество entries
        // map - в данном случае это просто имя переменной, которую мы сами выбрали
        for (Map.Entry entry: map.entrySet()){
            // Entry - это класс у которого есть поля key, value
            // получаем из entry ключ при помощи метод .getKey()
            // получаем из entry значение при помощи метода .getValue()
//            System.out.println(entry);
            System.out.println(entry.getKey() +" экаунт;  "+ entry.getValue());
        }
    }
}
//        Person[] people = {
//                new Person("Ruslan", "Ivanov", 40 ),
//                new Person("Ruslan", "Petrov", 45 ),
//                new Person("Gadya", "lilia", 30 ),
//        };
//        HashMap<String, Person> lNameToPersonMap = new HashMap<>();
//        for (Person person: people){
//            lNameToPersonMap.put(person.lName, person);
//        }
//        System.out.println(lNameToPersonMap);
//        Person person = lNameToPersonMap.get("Ivanov");
//        System.out.println(person);
//        //-------------------------------
//    }
//}