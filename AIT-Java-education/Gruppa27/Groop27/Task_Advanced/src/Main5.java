public class Main5 {
    public static void main(String[] args) {
        //Создать массив с явно-проинициализированными элементами
        //Вывести все четные элементы этого массива
        //и количество нечетных
        //решать через цикл (for) с условием(if)
        //Например для массива:
        //
        //-10, 7, 2, 6, 11, -3, 8
        //Вывод:
        //
        //-10, 2, 6, 8
        //3
        String[]array = {"rock", "jazz", "pop", "electronic", "house", "hip-hop", "classic","band"};
        for (int i = 0; i < array.length; i++) {
            if(i % 2==0){
                System.out.println(array[i]);
            }
        }
        System.out.println(array.length/2);
    }
}


