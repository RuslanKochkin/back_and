import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Acaunt> acauntList = List.of(
                new Acaunt("1234567890",new Person("Rostislav","Kochkin"),1000000),
                new Acaunt("1234567890",new Person("Rostislav","Kochkin"),1000000)
        );
        Map <Acaunt, Person>resultMap = getAcauntMap(acauntList);
        System.out.println(resultMap);
        System.out.println(getUniqueAccounts(acauntList));
    }
    public static Map<Acaunt,Person> getAcauntMap(List<Acaunt>acauntList){
        Map<Acaunt,Person>map = new HashMap<>();
        for (Acaunt acaunt: acauntList){
            map.put(acaunt, acaunt.getOwner());
        }
        return map;
    }
//Допустим, у вас есть список счетов, в котором счета повторяются.
// Нужно написать метод List < Account > getUniqueAccounts(List< Account > list)
// который сформирует список уникальных счетов
       public static List <Acaunt> getUniqueAccounts(List< Acaunt > list){
           HashSet<Acaunt> set = new HashSet<>(list);
           return new ArrayList<>(set);
       }

}