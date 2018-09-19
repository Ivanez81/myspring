package ru.geekbrains.myspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.geekbrains.myspring.component.TeamCoach;

public class MainApp {
    public static void main(String[] args) {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        TeamCoach teamCoach = context.getBean("teamCoach", TeamCoach.class);
//        System.out.println(teamCoach);
//        context.close();

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AppConfig.class);
        applicationContext.refresh();
        TeamCoach teamCoach = applicationContext.getBean("teamCoach", TeamCoach.class);
        System.out.println(teamCoach);
        applicationContext.registerShutdownHook();
    }
}
