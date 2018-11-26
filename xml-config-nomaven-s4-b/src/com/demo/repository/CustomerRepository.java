package com.demo.repository;

import java.util.List;

import com.demo.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}