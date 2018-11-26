package com.demo.service;

import java.util.List;

import com.demo.model.Customer;
import com.demo.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

//	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	private CustomerRepository customerRepository;
	
	//setter based dependency injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("setCustomerRepository(CustomerRepository customerRepository)");
		this.customerRepository = customerRepository;
	}
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
