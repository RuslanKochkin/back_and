public class Main {
    public static void main(String[] args) {

    }
    //Создайте метод, который принимает массив String[] arr и слово String word; Метод должен возвращать true -
    //если слово есть в массиве, false - если его нету. Метод не должен менять исходный массив.
    //Примеры:
    //для параметров {"apple", "orange"}, "orange" --> true;
    //для параметров {"apple", "orange"}, "banana" --> false

    public static boolean isWordArray(String[] array, String word) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(word)) {
                return true;
            }
        }
        return result;

    }

    //--------------------------------------------------------------------------------------
    //Создайте метод, который принимает массив слов, и заменяет самое длинное слово на "***".
    //Например,для массива {"apple", "orange", "grape"} вызов метода изменит массив на {"apple", "***", "grape"}.
    // Данный метод должен менять исходный массив.
    public static int getIndexOfMaks(String[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > array[maxIndex].length()) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
//------------------------------------------------------------------------------------------------

    //метод который делит два числа
    //трай (улавливатель ошибок) для того чтобы ловить ошибку в
    // данном случае чтобы не делилось на 0
//        try {
//        int res =0;
//        res= div(num1, num2);//заходит в метод
//        System.out.println("Результат");
//        System.out.println(res);
//    }catch (Exception e){
//        System.out.println("что то пошло не так");
//    }

//    public static int div(int num1,int num2){
//        return num1/num2;




