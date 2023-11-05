package de.ait;

import de.ait.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Scanner;

@Configuration
@ComponentScan
@PropertySource("classpath:application.property")

public class AppConfig {

    @Autowired
    private ApplicationContext context;


    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }
    @Bean
    public UserRepository userRepository(@Value("${user.repository.class}") String className){
       return context.getBean(className,UserRepository.class);
    }
}
