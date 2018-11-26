package com.spring4.repository;

import java.util.ArrayList;
import java.util.List;

import com.spring4.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring4.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstname("Jagadeesh");
		customer.setLastname("Ranganath");

		customers.add(customer);

		customer = new Customer();

		customer.setFirstname("Ninka");
		customer.setLastname("Latha");
		customers.add(customer);
		return customers;
	}
}
