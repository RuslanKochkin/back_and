import java.util.Scanner;

public class Main {
    //Напишите метод, который создает массив размера n элементов и заполняет его целыми числами по порядку,
    // начиная с заданного числа start
    //Например, при n=4 и start = 5 метод должен вернуть массив {5,6,7,8}
    //Напишите метод, который умножает каждый элемент этого массива на 2.
    //Напишите метод вывода массива на экран
    //Ваша программа должна запрашивать у пользователя размер массива и начальное число,
    // выводить на экран исходный массив, затем выводить на экран массив с умноженными на 2 элементами
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();

        System.out.println("Введите старт массива");
        int start = scanner.nextInt();
        int []array = createArray1(n, start); //можно подставить значения сразу
        print(array);
        array = createArray2(array);
        System.out.println("Массив умножили на 2");
        print(array);
        System.out.println("вывели в обратном порядке");
        print1(array);
        System.out.println("печатает только четные");
        print2(array);
        System.out.println("возвращает сумму всех элементов");

        System.out.println("сумма всех элементов из массива целых чисел, которые делятся и на 3 и на 5");
        sumArrayif(array);



    }
    public static void print(int[] a2) {
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i]);
        }
        System.out.println();
    }

    public static int[] createArray1(int n, int start) {
        int[]res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = start + i;
        }
        return res;
    }

    public static int[] createArray2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }

    //В коде первой задачи допишите еще 2 метода:
    //первый, который печатает массив, начиная с последнего элемента к первому
    //второй, который печатает только четные элементы массива
    public static void print1(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
        public static void print2( int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i]);
                }
            }
        }
            //Напишите метод , который принимает массив целых чисел и возвращает сумму всех элементов
            //{5,9,1} -> 15
            public static int sumArray( int [] arr) {
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum+= arr[i];
                }
                return sum;
            }
            //Напишите метод , который считает сумму всех элементов из массива целых чисел, которые делятся и на 3 и на 5
    //{15,9,1,30,5} -> 45 т.е. 15+30
            public static int  sumArrayif(int[] arr){
                int sum=0;
                for (int i=0; i < arr.length; i++){
                    if (arr[i]%3==0&&arr[i]%5==0){
                    }
                }
                return sum;
            }
    //Напишите метод, который возвращает самое большое число из заданного массива целых чисел.
    public static int maxNumber(int[] arr){
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(maxValue<arr[i]){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }

}




