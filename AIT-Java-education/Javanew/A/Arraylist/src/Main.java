import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        //добовляем элементы в ArrayList
        names.add("Same Maroko");
        names.add("Bob Langusto");
        names.add("Will Smith");
        System.out.println(names);
        System.out.println(names.get(0));//вывод элемента по индексу
        names.set(2, "Bred Pitt");//добавили элемент другой элемент вместо данного по индесу
        System.out.println(names);
        names.remove(1);//удолиляет элемент
        //Создайте эрей лист стрингов/положите в него значения "apple", "lame", "Mango"
        //замените первый индекс на "lemon"/ распечатайте лист

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("lame");
        fruits.add("Mango");
        fruits.set(1, "lemon");
        System.out.println(fruits);
        String word = fruits.get(1); //скопировали элемент из арей листа в переменную
        System.out.println(word);
        names.clear();//метод очищает эрей лист
        System.out.println(names);
        System.out.println(fruits.size());// метод показывает длинну эрей листа/количество элементов
        for (int i = 0; i < fruits.size(); i++) { // для получения и или изменения каждого элемента
            System.out.println(fruits.get(i));
        }
        ArrayList<Integer> numbers = new ArrayList<>();//создали ссылочный тип данных для хранения примитивных элементов классы обертки
        numbers.add(25);
        numbers.add(5);
        numbers.add(15);
        System.out.println(numbers);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(25);
        numbers2.add(10);
        numbers2.add(15);
        int sum = 0;
        for (int i = 0; i < numbers2.size(); i++) {
            sum = sum + numbers2.get(i);
        }
        System.out.println(sum);
//Создайте ArrayList стрингов.
//Добавьте туда произвольное число слов на ваше усмотрение.
//Используя цикл, объедините все элементы в одну большую строку String
// (используйте для этого промежуточную переменную "аккумулятор") и выведите получившийся результат в консоль.
//Например, для ["Apple", "Orange", "Grape"] должна получится строка "AppleOrangeGrape".
        ArrayList<String> bich = new ArrayList<>();
        bich.add("Kiti");
        bich.add("Milfa");
        bich.add("Dachka");
        bich.add("Margo");
        String priton = "";
        for (int i = 0; i < bich.size(); i++) {
        priton = priton + bich.get(i);
        }
        System.out.println(priton);

        //Задача 1 Напишите метод, который получает массив из строк, а возвращает LinkedList,
        // который содержит все строки исходного массива начинающиеся на “при”.
        // Например: {“пришел”,“поехал”,“приехал”,“проехал”} --> {“пришел”,“приехал”} Желательно использовать for…each
        String [] array = {"пришел","поехал","приехал","проехал"};
        LinkedList<String> filterList = mylist(array);
        System.out.println(filterList);
        //к задаче 2
        List<String> words2 = new LinkedList<>();
        words2.add("мама");
        words2.add("папа");
        words2.add("систра");
        LinkedList<String> filterList2 = mylist2(words2);
        System.out.println(filterList2);

    }
    public static LinkedList<String> mylist (String[] array){
        LinkedList<String> words = new LinkedList<>();
        for (int i = 0; i < array.length; i++) { // или форич for(String i :array) i - переменная просто
            if(array[i].startsWith("при")){  //или if(array[i].substring(0,3).eguals("ghb")
                words.add(array[i]);
            }
        }
        return words;
    }
//Задача 2 Напишите метод, который получает `List’, а возвращает LinkedList,
//который содержит все строки исходного List’а но в обратном порядке Например:
// {“1. Джэк”,“2. Джон”,“3. Ник”} --> {“3. Ник”,“2. Джон”,“1. Джэк”}
//Задача 2* (необязательно) выполнить задачу 2 используя for…each
    public static LinkedList<String> mylist2 (List<String> words2){
        LinkedList<String> newWords = new LinkedList<>();
        for (String i :words2){
        newWords.addFirst(i); //или newWords.add (0, i); метод разворачивает строки внутри листа т.е добовляет индексы спереди массива
        }
        return newWords;
    }
}

