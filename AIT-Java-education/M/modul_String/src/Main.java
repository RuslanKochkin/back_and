public class Main {
    public static void main(String[] args) {
            /*
    Создайте метод, который принимает массив слов, и заменяет самое длинное слово на "***".
    Например,для массива {"apple", "orange", "grape"} вызов метода изменит массив на  {"apple", "***", "grape"}.
    Данный метод должен менять исходный массив.
    1) переменная под ИНДЕКС самого длинного слова = 0
    2) перебираем массив
    3) каждый элемент сравниваем с текущим самым длинным словом
        если в массиве слово длиннее ->  в переменную "ИНДЕКС самого длинного слова"
        запиываем текущее 1
     */
        String[] strings = {"Jack", "John", "Andrey", "Anna"};
        System.out.println("Исходный массив:");
        print(strings);
        changeWord(strings, getIndexOfMaxWord(strings));
        System.out.println("массив результат:");
        print(strings);
    }
    public static void print(String[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
    public static int getIndexOfMaxWord(String[] array){
        int maxIndex=0;
        for (int i = 1; i < array.length ; i++) {
            if(array[i].length() > array[maxIndex].length()) {
                maxIndex=i;
            }
        }
        return maxIndex;
    }

    public static void changeWord(String[] array, int index){
        array[index]="****";
    }


    public static int getIndexOfMaxWord2(String[] array){
        int maxIndex=0;
        String maxWord=array[0];
        for (int i = 1; i < array.length ; i++) {
            if(array[i].length() > maxWord.length()) {
                maxIndex=i;
                maxWord=array[i];
            }
        }
        return maxIndex;
    }



}
//-------------------------------------------------------------------------------------------
////        Дано два массива, массив с именами студентов String[] students
////        второй массив int[] skipLessons, в котором указано сколько занятий пропустил соответствующий студент.
////        Т.е. если в первом массиве students[2]="jack", то skipLessons[2] содержжит количество прогуленных Джжеком занятий. Вам нужно реализовать:
////        - метод, который печатает всех студентов, у кого прогулов больше чем заданное число N
////                - метод, который создаст новый массив со строками вида:
////        "Jack прогулял 5 занятий"  для всех студентов, которые прогулмвали
////        "Nick не прогуливал" для всех, кто не прогуливал

//        String[] students1 = new String[]{"Bob", "Frank", "Simon", "George", "Ivan"};
//        int[] skipLessons1 = new int[]{1, 10, 3, 4, 0};
//        int n = 3;
//        printStudentsBySkips(students1, skipLessons1, n);
//
//        String[] report1 = getReport(students1, skipLessons1);
//        print(report1);
//
//    }
//    public static void print(String[] arr){
//        for (int i =0; i< arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//    // 1. метод, который печатает всех студентов, у кого прогулов больше чем заданное число N
//    public static void printStudentsBySkips(String[] students,int[] skippedLessons,int number) {
//        // печатать студентов у кого больше указанного количества пропусков

//        for (int i = 0; i < students.length; i++) {
//            if (skippedLessons[i] > number) {
//                System.out.println(students[i]);
//            }
//        }
//    }
//
//    // 2. метод, который создаст новый массив со строками вида:
//    ////        "Jack прогулял 5 занятий"  для всех студентов, которые прогуливали
//    ////        "Nick не прогуливал" для всех, кто не прогуливал

//    public static String[] getReport(String[] students, int[] skippedLessons) {
//        String[] reportArray = new String[students.length];
//        for (int i = 0; i < students.length; i++) {
//            if (skippedLessons[i] > 0) {
//                // первый вариант: "Jack прогулял 5 занятий"
//                reportArray[i] = students[i] + " прогулял(а) " + skippedLessons[i] + " занятий";
//            } else {
//                // второй случай: "Nick не прогуливал"
//                reportArray[i] = students[i] + " не прогуливал(a)";
//            }
////            // другой вариант с тернарником
////            reportArray[i] =
////                    skippedLessons[i] > 0
////                            ? students[i] + " прогулял(а) " + skippedLessons[i] + " занятий"
////                            : students[i] + " не прогуливал";
//        }
//        return reportArray;
//    }
//
//}
