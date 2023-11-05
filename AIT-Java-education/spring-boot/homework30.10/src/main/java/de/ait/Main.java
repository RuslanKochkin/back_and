package de.ait;

import de.ait.model.AppConfig;
import de.ait.model.Camera;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        Camera camera;
        while (!exit) {
            System.out.println("Input: 1- creat color Photo, Input: 2- creat BlackAndWhite Photo, or exit");
            String command = scanner.nextLine();
            switch (command) {
                case "exit":
                    exit = true;
                    break;
                case "1":
                    camera = context.getBean("colorCamera", Camera.class);
                    camera.doPhotograph();
                    break;
                case "2":
                    camera = context.getBean("blackAndWhiteCamera", Camera.class);
                    camera.doPhotograph();
                    break;
            }
        }
    }
}
