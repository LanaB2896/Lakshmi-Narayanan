package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.CustomerService;

public class App 
{
    public static void main( String[] args )
    {
//    	Eliminating hard coded instance
//	CustomerService service = new CustomerServiceImpl();
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    	CustomerService service = applicationContext.getBean("customerService",CustomerService.class);
    	System.out.println(service.findAll().get(0).getFirstname());
		System.out.println(service.findAll().get(0).getLastname());
    }
}
