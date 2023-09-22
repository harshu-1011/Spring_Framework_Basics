package com.test4;

/**
 * Hello world!
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	  ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

          student s1 = (student) context.getBean("myBean1");
          System.out.println(s1);    
    }
}
