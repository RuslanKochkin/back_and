//import java.io.*;
//import java.nio.Buffer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
////        BufferedWriter writer = new BufferedWriter(new FileWriter("./res/output.txt"));
//////        writer.write("Всем привет это наше первое сообщение");
//////        writer.newLine();
//////        writer.write("Всем привет это наше второе сообщение");
//////        writer.newLine();
////        for (int i = 0; i <100; i++) { //цыкл набора цыфр в файл
////            writer.write("Step " + i);
////            writer.newLine();
////        }
////        writer.close();
////        BufferedReader reader = new BufferedReader(new FileReader("./res/output.txt"));
////        String line;
////        while ((line = reader.readLine())!=null){ //цыкл чтения в консоль
////            System.out.println(line);
////        }
////        reader.close();
//        //------------------Получаем из консоли и записуем в файл
//        BufferedReader reader1 = new BufferedReader( new InputStreamReader(System.in));//бафер считывает поток ввода
//        System.out.println("Как ваши дела?");
//        String answer = reader1.readLine();
//        reader1.close();
//        BufferedWriter writer1 = new BufferedWriter(new FileWriter("./res/output.txt",true));//создали поток ввода
//        writer1.write(answer);
//        writer1.newLine();
//        writer1.close();// закрыли поток ввода
//
//    }
//}