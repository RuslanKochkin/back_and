public class Main {
    public static void main(String[] args) {
        String[] students1 = {"Bob", "Frank", "Simon", "George", "Ivan"};
        char symbol = 'b';
        String [] array1 = replacement(students1,symbol);
        print(array1);



    }

    public static void print(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " , ");
        }
    }
    //Создайте метод,который принимает массив слов и char symbol, и
    //заменяет все слова оканчивающиеся на этот символ на слово bingo.
    public static String[] replacement(String[] array, char a) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(array[i].length() - 1) == a) {
                array[i] = "bingo";
            }
        }
        return array;
    }
}




//String str = "Hello, World!";
//char c = 'o';
//for (int i = 0; i < str.length(); i++) {
//    if (str.charAt(i) == c) {
//        System.out.println("Symbol 'o' is present at index " + i);
//    }
//}
//------------------
//        public static void replaceLongest(String[] words) {
//        // - найти maxLength
//        int maxLength = words[0].length();
//        for(int i = 1; i < words.length; i++){
//            if(words[i].length() > maxLength){
//                maxLength = words[i].length();
//            }
//        }
//        // после того как мы прошли по всему массиву
//        // только теперь maxLength - длинна самого большого слова
//        // - заменить все слова с этой длинной на звездочки
//        for (int i = 0; i < words.length; i++){
//            if (words[i].length() == maxLength){
//                words[i] = "***";
//--------
//        for (int i = 0; i < str.length(); i++ ){
//            if (str.charAt(i)==symbol){
//                return i;
//            }
//        }
//        return -1;