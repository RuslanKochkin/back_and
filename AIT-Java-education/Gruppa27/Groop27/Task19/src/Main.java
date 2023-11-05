//import java.util.Arrays;
//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random r = new Random();
//        int[] array = generateRandomArray( 10, 1000, r);
//        System.out.println(Arrays.toString(array));
//        System.out.println(passwordСheck(array));
//
//    }
//    public static boolean passwordСheck(int[] password){
//        int[]arr = new int[9];
//        arr [0]='c'; arr [1]='B'; arr [3]='+'; arr [5]='-'; arr [6]='?'; arr [7]='_'; arr [8]='*';
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < password.length; j++) {
//                if(password[i]==arr[i]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public static int[] generateRandomArray(int length, int bound, Random random) {
//        // создаем массив
//        int[] array = new int[length];
//        // заполняем массив случайными числами
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(bound);
//
//        }
//        // возвращаем массив как результат
//        return array;
//    }
//}
//1. Реализовать функцию проверки пароля со следющими правилами:
//- минимум две большие буквы
//- минимум две цифры, не стоящие рядом
//- миниму один знак +-*?_-
//- общая длина не менее 8 символов
//- остальные символы запрещены
//
//2. Реализовать функцию генерации случайного пароля
//
//3. Проверить сгенерированный пароль с помощью функции проверки