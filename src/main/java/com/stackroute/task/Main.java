package com.stackroute.task;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = (Movie)applicationContext.getBean("movie");
        System.out.println(movie.getActor());

        XmlBeanFactory bean = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie1 = (Movie) bean.getBean("movie1");
        System.out.println(movie1.getActor());
    }
}
