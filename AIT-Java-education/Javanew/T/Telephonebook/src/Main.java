import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//Создайте новый проект(File -> New -> Project)
//Назовите его TelephoneBook
//Внутри проекта создайте папку res
//Выведите сообщение для пользователя: "Желаете добавить контакт?"
//Далее c помощью BufferedReader получите от пользователя имя и номер телефона
//Выведите сообщение для пользователя: "Введите имя"
//Выведите сообщение для пользователя: "Введите номер"
//И запишите их в файл contacts.txt в папке res c помощью BufferedWriter
//* дополнительно сделайте вариант с циклом while или do-while,
// который бы спрашивал у пользователя контакты, пока пользователь не скажет нет.

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new FileWriter("./res/contacts.txt", true));
    String answerYes;
    do {
        System.out.println("Желаете добавить контакт (да/нет): ");
        answerYes = reader.readLine();
        if (answerYes.equalsIgnoreCase("да") || !answerYes.equalsIgnoreCase("нет")){
            if (!answerYes.equalsIgnoreCase("нет")) {
                System.out.println("Введите имя");
                writer.write("Контактные данные" + reader.readLine() + ",");
                System.out.println("Введение номер: ");
                writer.write("тел" + reader.readLine());
                writer.newLine();
             }
        }
        }while (!answerYes.equalsIgnoreCase("нет")) ;
        reader.close();
        writer.close();
        //---------------------------------------------------------------------


    }
}

//        BufferedReader reader1 = new BufferedReader( new InputStreamReader(System.in));//бафер считывает поток ввода
//        System.out.println("Как ваши дела?");
//        String answer = reader1.readLine();
//        reader1.close();
//        BufferedWriter writer1 = new BufferedWriter(new FileWriter("./res/output.txt",true));//создали поток ввода
//        writer1.write(answer);
//        writer1.newLine();
//        writer1.close();// закрыли поток ввода




//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter writer = new BufferedWriter(new FileWriter("./res/thoughts.txt", true));
//        String answer1 = "да";
//        while(answer1.equals("да")) {
//            System.out.println("Хотите записать еще одну умную мысль?");
//            answer1 = reader.readLine();
//            if (answer1.equals("да")) {
//                System.out.println("Какую?");
//                // получили ответ - сразу записали
//                writer.write(reader.readLine());
//                writer.newLine();
//            }
//        }
//        reader.close();
//        writer.close();
