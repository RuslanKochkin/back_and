import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String word = "transporter";
//        int word1 = word.length() - 1;

//        System.out.println(word1);
        //Создайте метод,который принимает массив слов и char symbol, и
        //заменяет все слова оканчивающиеся на этот символ на слово bingo.

//        String[] array = {"tansporter", "yyyyyoor"};
//        char a = 'r';
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].length() == a) {
//                System.out.println(array[i]);
//            }
//        }
//    }

        String str = "HelloWorld!";
        char c = 'o';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                System.out.println("Symbol 'o' is  " + i);
            }
        }
        //Метод который добовляет зарплату относительно  стажа и профессии---------------------------------------------
//        public void paySelaryToAll(){
//            for(Employee employee : employees){
//                if(employee.experience > 2){
//                    // по 2 % надбавки за каждый год
//                    employee.moneyAccount += 3000 + 3000 * 0.02 * employee.experience;
//                } else {
//                    employee.moneyAccount += 3000;
//                }
//                if(employee.position.equals("dantist")){
//                    // дантисту, чтобы он не ушел - еще бонус
//                    employee.moneyAccount += 1000;
//                }
//            }
//        }
       //------------------------
        //Задание 1
        //Пусть пользователь введет свою температуру: например, 38.8.
        //Если температура больше 39, выведите в консоль фразу:
        // «Нужно срочно обратиться к врачу». Если температура меньше, то выведите фразу: «Лечитесь дома»


        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите какая у Вас температура: ");
        int Temperature = scanner.nextInt();
        if (Temperature >= 39) {
            System.out.println("Нужно срочно к врачу");
        } else {
            System.out.println("Лечитесь дома");
        }
        //Написать метод, который возвращает ИНДЕКС максимального элеиента в массиве
        public static int indexMax(int[] a) {
            int maxValue = 0;
            for (int i = 1; i < a.length; i++) {
                if (a[i] > a[maxValue]) {
                    maxValue = i;
                }
            }
            return maxValue;
        }

        //-------------------------------------------------------------------------------------------------
        // Написать метод, который возвращает ИНДЕКС минимального элеиента в массиве
        public static int indexMin(int[] a) {
            int minValue = 0;
            for (int i = 1; i < a.length; i++) {
                if (a[i] < a[minValue]) {
                    minValue = i;
                }
            }
            return minValue;
        }
    }
    }
}
//        int currentMin;
//        int indexOfCurrentMin;
//        int temp;
//
//        for (int i = 0; i < array.length; i++) {
//            currentMin = array[i];
//            indexOfCurrentMin = i;
//
//            for (int j = i + 1; j < array.length; j++) { // поиск минимального
//                if (array[j] < currentMin) { // если a[j] меньше, чем текущий минимальный
//                    currentMin = array[j]; // запоминаем его как минимальный
//                    indexOfCurrentMin = j; // запомнили его индекс
//                }
//            }
//
//            // a[0] <-> a[indexOfCurrentMin]
//            temp = array[i];
//            array[i] = array[indexOfCurrentMin];
//            array[indexOfCurrentMin] = temp;
//
//            System.out.println(Arrays.toString(array));
//        }
//---------------Метод генерации случайного имени
//    public static String getRandomName(){
//        Random random = new Random();
//        String name = "" + (char)(65 + random.nextInt(26));
//        for (int i = 0; i < 2 + random.nextInt(8); i++){
//            name += (char)(97 + random.nextInt(26));
//        }
//        return name;
//        // можно было первый символ toUpperCase
//    }
//
//    }

