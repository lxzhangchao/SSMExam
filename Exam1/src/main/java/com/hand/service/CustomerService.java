package com.hand.service;

import java.util.List;

import com.hand.model.Customer;

public interface CustomerService {
	public void create(String first_name,String last_name,String email,String address);
	public List<Customer> listCustomers();
	public void delete(Integer customer_id);
	public void update(Integer customer_id,String first_name,String last_name,String email,String address);
}
