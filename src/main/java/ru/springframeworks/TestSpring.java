package ru.springframeworks;

import ru.springframeworks.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

Computer computer= context.getBean("computer",Computer.class);
System.out.println(computer);
        context.close();
    }
}