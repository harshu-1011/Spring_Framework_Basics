package com.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Inject Reference Type

public class App 
{
    public static void main( String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Addition obj = (Addition) context.getBean("beanAddition");
        obj.add();
    }
}
