package com.demo;

import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

public class App 
{
    public static void main( String[] args )
    {

    	CustomerService service = new CustomerServiceImpl();

		System.out.println(service.findAll().get(0).getFirstname());
		System.out.println(service.findAll().get(0).getLastname());
    }
}
