public class Main {
    public static void main(String[] args) {
//Создайте метод, который принимает массив и число - возвращает элемент массива по этому числу (номеру).
// Пусть метод выбрасывает ошибку, если число меньше нуля или больше длины массива - 1.
// Добавьте сообщение в ошибку, вызовите метод в main.
        int[] students1 = {1, 5, 8, 4, 9, 3, 0};
        int symbol = 5;
        int array1 = replacement(students1,symbol);
        System.out.print(array1);
    }

    //Создайте метод,который принимает массив слов и char symbol, и
    //заменяет все слова оканчивающиеся на этот символ на слово bingo.
    public static int replacement(int[] array, int a) {
        for (int i = 0; i < array.length; i++) {
            if (i == a) {
                int arr = array[i];
            }
        }
        return a;
    }
}
