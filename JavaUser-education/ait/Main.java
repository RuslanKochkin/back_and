package de.ait;

import de.ait.controllers.UserController;
import de.ait.controllers.UserControllerConsoleImp;
import de.ait.repositories.UserRepository;
import de.ait.repositories.UserRepositoryFileImpl;
import de.ait.services.UserService;
import de.ait.services.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserController controller = context.getBean(UserController.class);





        //UserRepository repository = new repositories.UserRepositoryListImpl();
//        UserRepository repository = new UserRepositoryFileImpl("users.txt");
//        UserService service = new UserServiceImpl(repository);
//        UserController controller = new UserControllerConsoleImp(service);

        Scanner scanner = context.getBean(Scanner.class);
        boolean exit=false;
        while (!exit) {
            System.out.println("Input: 1 - create new user, 2 - print all users, exit - finish program");
            String command = scanner.nextLine();
            switch (command){
                case "exit": exit=true;break;
                case "1": controller.create();break;
                case "2": controller.printAll();break;
            }
        }
    }

}
