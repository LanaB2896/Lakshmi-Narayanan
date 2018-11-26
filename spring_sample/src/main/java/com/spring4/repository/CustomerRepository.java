package com.spring4.repository;

import java.util.List;

import com.spring4.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}