import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// Collection - интерфейс базовый для всех коллекций, для листов, для сетов и т.д.
// Collections - утилитарный класс, с кучей методов для работы с коллекциями
// Collections.sort - сортировать любую коллекцию
// Collections.reverse(); - развернуть лист
// Collections.copy(); - скопировать один лист в другой
// Collections.min() Collections.max() - минимальное\максимальное значени

//Подсказка 1. Запрос «в каком порядке сортировать» можно организовать,
//например, следующим образом: “1-по имени и фамилии, 2- по количеству пропусков,
// 3 – по количеству выполненных работ. Выберите номер сортировки:
//Подсказка 2. Для каждого варианта необходимо создать свой компоратор.
public class Main {
    public static void main(String[] args) throws IOException {
        List<Student> listStudent = new ArrayList<>(List.of(
                new Student("Petr", "Petrov", 9, 2),
                new Student("Vasil", "Sidorov", 1, 3),
                new Student("Ruslan", "Wefreim", 3, 3),
                new Student("Anna  ertytty", "Carenina", 7, 7),
                new Student("Ivan", "Redator", 6, 1),
                new Student("Mark", "Tvene", 8, 6),
                new Student("Buki", "Mahitov", 1, 5),
                new Student("Ebait", "Orlando", 9, 10),
                new Student("Carina", "Dimidova", 1, 16)
        ));
        Comparator<Student> comparator = new StudentByName();
        Comparator<Student> comparator1 = new StudentByDoneHomeWork().reversed();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер сортировки: 1-по Имени; 2- по пропускам; 3-по выполнению д/з");
        int sort = scanner.nextInt();
        if (sort == 1) {
            Collections.sort(listStudent, comparator);
            System.out.println(listStudent);
        }
        if(sort == 2){
            Collections.sort(listStudent);
            System.out.println(listStudent);
        }
        if(sort == 3){
            Collections.sort(listStudent,comparator1);
            System.out.println(listStudent);
        }else {
            System.err.println("Неверно");
        }
        //-------------------------Вариант 2----------------------
//        System.out.println("Выберите способ сортировки");
//        System.out.println("1 - по имени и фамилии, 2 - по количеству пропусков, 3 – по количеству выполненных работ.");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String answer = reader.readLine();
//        switch (answer) {
//            case "1" -> listStudent.sort(new StudentByDoneHomeWork());
//            case "2" -> Collections.sort(listStudent);
//            case "3" -> listStudent.sort(new StudentByDoneHomeWork());
//            default -> System.out.println("Нет такого варианта сортировки");
//        }
//        System.out.println(listStudent);
    }
}