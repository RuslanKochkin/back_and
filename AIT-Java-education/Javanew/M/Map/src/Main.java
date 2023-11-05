import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Map хранит  1 ключ и 2 значение
        HashMap<Integer, String> month = new HashMap<>();
        month.put(1, "Январь");
        month.put(2, "Февраль");
        month.put(3, "Март");
        month.put(4, "Апрель");
        month.put(5, "Май");
        month.put(6, "Июнь");
        //System.out.println(month);
        //System.out.println(month.get(3)); //берем значение по ключу, ключь не является упорядоченным индексом
        //System.out.println(month.get(13)); //такого ключа нет выдаст null

        HashMap<String, String> users = new HashMap<>(); //ключ строка и значение тоже строка
        users.put("potolok.navsegda@gmail.com", "Ruslan Kochkin");
        users.put("potolok@gmail.com", "Ruslan Pupkin");
        // System.out.println(users);
        String inputEmail = "potolok@gmail.com";

        String user = users.get(inputEmail);
        if (user != null) {
            //System.out.println("Привет " + user);
        } else {
            //System.out.println("нужно зарегистрироваться");
        }
        users.put("potolok.navsegda@gmail.com", "rrrrr");//ключи уникальные а значения могут повторятся
//        System.out.println(users);
        Set<String> keys = users.keySet();//берем все ключи и складываем в сет
        //перебрать все пары Map---------------------------------------------------------------
        for (String key : keys) {
            String value = users.get(key);
             System.out.println("key: " + key + "  " + value);
        }//-----------------------------
//    }        HashMap<String, String> lNameTofName = new HashMap<>();
//        for (Person p: people){
//        lNameTofName.put(p.lName, p.fName);
//    }
//        System.out.println(lNameTofName);
//
//    HashMap<Integer,String> ageTofName = new HashMap<>();
//        for (Person p1: people){
//        ageTofName.put(p1.age, p1.fName);
//    }
//        System.out.println(ageTofName);
    }
}