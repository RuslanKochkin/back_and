public class Main {
    public static void main(String[] args) {
        int[] array = {0, 5, 0, 0, 4, 7, 0};
        int num = 3;
        int number = 36789;
        System.out.println(min(array));
        System.out.println(average(array));
        System.out.println(sum(number));
        System.out.println(сontent(array, num));
        System.out.println(quantityInt(array));
    }
//1. Написать функцию, которая возвращает минимальный элемент массива
//4, 2, 3, -1, 10 -> -1
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        return min;
    }

    //2. Написать функцию, которая возвращает среднее арифметическое значение элементов массива
//(4 + 2 + 3 -1 + 10) / 5 = 3.6
    public static double average(int[] arr) {
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average = average + arr[i];
        }
        return average / arr.length;
    }

    //3. Написать функцию, которая возвращает сумму цифр какого-либо числа
//4321 -> 4 + 3 + 2 + 1 = 10
    public static int sum(int arr) {
        int sum = 0;
        for (; arr > 0; arr /= 10) {
            sum += arr % 10;
        }
        return sum;
    }

//4. Написать функцию, которая возвращает true, если какое-либо число содержится в массиве, false - в противном случае
//4, 2, 3, -1, 10, ищем 3  -> true
//4, 2, 3, -1, 10, ищем 77 -> false
    public static boolean сontent(int[] array,int num) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                result = true;
                    return result;
            }
        }
        return result;
    }
//5. Написать функцию, которая находит количество нулей в каком-либо массиве
//4, 0, 3, 0, 10 -> 2
    public static int quantityInt( int[] num){
        int quantity = 0;
        for (int i = 0; i < num.length; i++) {
            if(num[i] == 0){
                quantity = quantity +1;
            }
        }
        return quantity;
    }
}

