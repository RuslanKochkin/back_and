import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Создайте массив char со следующими элементами: 'j', 'l', 'k', 't', 'y', 'u'.
//Выведите элементы в консоль в обратном порядке.
//(Внимание! В обратном порядке - это от последнего элемента к первому )
//        char[] letters = {'j', 'l', 'k', 't', 'y', 'u'};
//        //int i = num - 1; i >= 0; i--
//        for (int i = letters.length-1; i >= 0; i--) {
//            System.out.print(letters[i]);
//        }
//Создайте массив из следующих элементов: "Dog", "Cat", "Monkey", "Snake".
//Поменяйте местами значения между ячейкой под индексом 1 и ячейкой под индексом 3.
//        String[] planets = {"Dog", "Cat", "Monkey", "Snake"};
//        String temporary = planets[0];
//        planets[0] = planets[3];
//        planets[3] = temporary;

//Создайте массив чисел от 1 до 97. После создания выведите все элементы массива в консоль.
//        int[] arrayOfNumbers = new int[97];
//        int i = 0;
//        while (i <= 96){
//            arrayOfNumbers[i] = 1 + i;
//            System.out.print(arrayOfNumbers[i]);
//            i++;
//
//        }
//
//    }
//}
        //-----------------------------------------------------------------------------------
//        System.out.println("Перестановка данных в массиве");
//
//        // Мой дядя самых честных правил
//
//        String[] words = new String[5];
//
//        // words[0] = "";
//        words[0] = "Мой";
//        words[1] = "дядя";
//        words[2] = "самых";
//        words[3] = "честных";
//        words[4] = "правил";
//
//        for (int i = 0; i < words.length; i++) {
//            System.out.print(words[i] + " ");
//        }
//
//        String buffer;
//        buffer = words[4];
//        words[4] = words[0];
//        words[0] = buffer;
//
//        System.out.println();
//
//        for (int i = 0; i < words.length; i++) {
//            System.out.print(words[i] + " ");
//import java.util.Scanner;
//------------------------------------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Массивы");
//
//        int[] myArray = new int[20]; // длина массива 20 (кол-во его элементов), а их идексы стартуют с 0
//        // и идут до 19
//
//        int i = 0;
//
//        // заполнение массива
//        while (i < 20 ) {
//            myArray[i] = 100 + i;
//            i++; // i := i + 1 - было в старых языках
//        }
//
//        // печать массива
//        for (int j = 0; j < myArray.length; j++) {
//            System.out.println(myArray[j]);
//        }
//
//        // System.out.println(myArray);
//----------разные (именные) массивы с обращением к двум методам/связанных между собой вызовоми методов---------
//        char[]array=createArray();
//        reversPrintArray(array);

        char[]array33=createArray();
        reversPrintArray(array33);
    }
//        Создайте массив char со следующими элементами: 'j', 'l', 'k', 't', 'y', 'u'.
//        Выведите элементы в консоль в обратном порядке.
//        (Внимание! В обратном порядке - это от последнего элемента к первому )
    public static char[] createArray(){
        char[] arr = {'j', 'l', 'k', 't', 'y', 'u'};
        return arr;
    }
    public static void reversPrintArray(char[] arr1){
        for (int i=arr1.length-1;i>=0; i--){
            System.out.print(arr1[i]);
        }
        //------------------------------------------------------------------------------------
//        int[]array = createArray();
////        printArray(array);
//        System.out.println("---------------------");
////        swap(array);
//        printArray(array);
//    }

        // Создайте массив из следующих элементов: "Dog", "Cat", "Monkey", "Snake".
// Поменяйте местами значения между ячейкой под индексом 1 и ячейкой под индексом 3.
// Вывести этот метод на экран
//    public static String[]swap(String[]array){
//        String temp = array [1];
//        array[1] = array[3];
//        array[3] = temp;
//        return array;
//
//    }
//      public static int [] createArray() {
//        return new int[]{4, 5, 6, 7};
//    }
//       public static void printArray(int[] array){
//       for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        //---------------------------------------------------------------------------------------------------


//    // 1
////Напишите метод, который создает массив размера n элементов
// и заполняет его целыми числами по порядку,
// начиная с заданного числа start
////Например, при n = 4 и start = 5 метод должен вернуть массив {5,6,7,8}
////Напишите метод, который умножает каждый элемент этого массива на 2.
////Напишите метод вывода массива на экран
////Ваша программа должна запрашивать у пользователя размер массива и начальное число, выводить на экран исходный массив,
//// затем выводить на экран массив с умноженными на 2 элементами


//---------------------------------------------------------------------------------------------


    }
}

//--------------------------------------------------------------------------------------------------------------
