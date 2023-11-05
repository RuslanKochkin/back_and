import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.put("Tomorrow", "Завтро");
        dictionary.put("Hello", "Привет");
        dictionary.put("Will", "Буду");
        dictionary.put("Read", "Писать");
        dictionary.put("Beautiful", "Красивые");
        dictionary.put("Songs", "Песни");
        Dictionary.Printer printer1 = dictionary.new Printer("|");
        printer1.print();
        System.out.println(dictionary.get("Hello"));
        String[] words = {"Read","Beautiful","Songs"};
        Dictionary.Translator translator = dictionary.new Translator();
        translator.translate(words);





    }
}
//Создать класс "Dictionary" - таблица слов и их переводов.
//
//dictionary.put("Hello", "Привет");
//dictionary.put("Bye", "Пока");
//
//dictionary.get("Hello"); // Привет
//
//Вложенный класс - DictionaryPair (содержит исходное слово и перевод)
//Внутренний класс - Translator
//
//Класс содержит метод String[] translate(String[] words)
//
//dictionary.put("Hello", "Привет");
//dictionary.put("Bye", "Пока");
//
//String[] words = {"Hello", "Bye", "Java"};
//
//translator.translate(words); // {"Привет", "Пока", "Java"}
//
//Он переводит входной набор слов по конкретному словарю.