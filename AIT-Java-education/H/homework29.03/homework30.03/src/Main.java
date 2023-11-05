public class Main {
    public static void main(String[] args) {
        //Напишитте метод, который получает три целых числа и возвращает true,
        // первое и второе число в сумме дают третье число, иначе false
//        int num1 =20;
//        int num2=45;
        String str1="Супер";
        String str2="Суперкласс";
        System.out.println(strString(str1, str2));
    }
//    public static boolean sumNumber(int num1, int num2, int num3){
//        return (num3==(num1+num2))? true: false;
//    }
////Напишитте метод, который получает три целых числа и возвращает true,
//// если среди этих чисел есть такое, которое равно сумме двух оставшихся чисел.
////Например:
////(8,15,7) -> true;
//// (12,15,7) -> false;
////Подсказка: используйте метод, написанный в задаче 1.
//public static boolean sumNumber2(int num1, int num2, int num3){
//    return (num3==num1+num2)||(num2==num1+num3)||(num1==num2+num3)? true: false;
//    }
//Напишитте метод, который получает две строки и возвращает длинну строки (т.е. int), которая длиннее.

    public static int strString(String str1, String str2) {
        return (str1.length()>str2.length())? str1.length():str2.length();
    }

}
//        public static int getMaxNum (int num1, int num2, int num3){
//        return getMaxNum(getMaxNum(num1, num2), num3);//число из второго метода и два числа из второго метода,
//            // сравненных в первом методе, повторно сравниваем с помощью первого метода и получаем





//( условие ) ? выражение 1 : выражение 2 ;
//условие - выражение, принимающее значение true или false т.е. boolean.
//выражение1 - выражение, которое будет результатом, если условие истинно
//выражение2 - выражение, которое будет результатом, если условие ложно
//выражение1 и выражение2 - должны иметь одинаковый тип