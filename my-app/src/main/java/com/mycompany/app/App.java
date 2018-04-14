package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
    	BeautySalon obj1 = (BeautySalon) context.getBean("salon1");
    	obj1.printSalon();
    	BeautySalon obj2 = (BeautySalon) context.getBean("salon2");
    	obj2.printSalon();
    }
}
