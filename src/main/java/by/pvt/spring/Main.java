package by.pvt.spring;

import by.pvt.spring.config.UserConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        FirstApp firstApp = applicationContext.getBean("firstApp", FirstApp.class);
        firstApp.hello();

        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(UserConfig.class);
        SecondApp secondApp = applicationContext1.getBean(SecondApp.class);
        secondApp.hello();


    }
}
