import java.util.ArrayList;
import java.util.Arrays;

public class Dictionary {
    private DictionaryPair[] dictionary; // массив пар ключ-значение
    private int count; // количество добавленных пар, изначально - 0

    public Dictionary() {
        this.dictionary = new DictionaryPair[10]; // выделяем память под массив пар, размерности 10
        this.count = 0;
    }
    //---------
    private static class DictionaryPair {
        String key;
        String value;

        DictionaryPair(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    //----------
    public class Printer {
        private String separator;

        public Printer(String separator) {
            this.separator = separator;
        }

        public void print() {
            System.out.println("Печатаем таблицу");
            for (int i = 0; i < count; i++) {
                System.out.println(dictionary[i].key
                        + separator + dictionary[i].value);
            }
        }
    }
//--------------------
    public void put(String key, String value) {
        for (int i = 0; i < count; i++) {
            if (dictionary[i].key.equals(key)) {
                dictionary[i].value = value;
                return;
            }
        }
        dictionary[count] = new DictionaryPair(key, value);
        count++;
    }
    public class Translator {
        public  String[] translate(String[] words) {
            String [] concatenatedArray = new String[words.length];
            for (int i = 0; i < words.length; i++) {
                    concatenatedArray[i] = get(words[i]) ;
                }
            System.out.println(Arrays.toString(concatenatedArray));
            return concatenatedArray;
        }
    }
    public String get(String key) {
        // пробежать все пары ключ-значение
        for (int i = 0; i < count; i++) {
            if (dictionary[i].key.equals(key)) { // если у какой-то пары совпал ключ
                return dictionary[i].value; // возвращаем значение этой пары
            }
        }
        // если мы ни разу не сделали return, значит ключа нет
        throw new IllegalArgumentException("Ключа <" + key + "> в таблице нет");
    }
}