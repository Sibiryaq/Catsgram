package ru.solorepeat.Catsgram.SpringAndDB.DependencyInjection.spring_di_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Cначала Spring найдёт классы, отмеченные @Component - это классы А и В
 * и добавит их в контекст
 * Затем увидит, что конструктор класса А, помечен @Autowired и установить что ему требуется объхект класса В
 * Spring создаст объект класса В и едобавит его в контекст,
 * после чего создаст объект класса А, передав ему объект класс В из контекста.
 */
@SpringBootApplication //указываем, что SB возьмёт на себя создание контекста
public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AppMain.class, args);
        A a = context.getBean(A.class);
        a.printName();

    }
}
