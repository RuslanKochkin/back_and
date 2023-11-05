public class Main {
    public static void main(String[] args) {
//        for (int i = 10; i >= 0; i--){
//            System.out.println(i);
//           if (i == 0){
//               System.out.println("Поехали");
//           }
//        }

        // break
//        for (int i = 1; i <= 50; i++) {
//            System.out.println(i);
//            if (i % 15 == 0) {
//                break;
//            }
//        }
        // continue - выбрасывает из итерации
//        for (int i = 0; i < 10;i++){
//            if(i == 2){
//                continue;
//            }
//            System.out.println(i);
//        }
        for (int i = 1; i < 10;i++) {
            System.out.println("начало итерации №" + i);
            System.out.println("выполняем задачу 1");
            System.out.println("выполняем задачу 2");
            if (i == 7) {
                continue;
            }
            System.out.println("выполняем задачу 3");
            System.out.println("конец итерации №" + 1);
        }
    }
    public static void print(){
        for (int i = 1; i < 10;i++) {
            if (i == 2) {
                return;
            }
            System.out.println(i);
        }
    }
}