package com.hand.service.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.hand.mapper.CustomerMapper;
import com.hand.model.Customer;
import com.hand.service.CustomerService;


public class CustomerServiceImpl implements CustomerService{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject; 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	public void create(String first_name,String last_name,String email,String address){
		String SQL = "insert into customer (first_name,last_name, email ,address) values (?,?,?,?)";     
		jdbcTemplateObject.update( SQL, first_name,last_name, email ,address);
		return;
	}
	public List<Customer> listCustomers(){
		String SQL = "select * from customer address where customer_id=address_id";
		List <Customer> customers = jdbcTemplateObject.query(SQL, 
				new CustomerMapper());
		return customers;
	}
	public void delete(Integer customer_id){
		String SQL = "delete from customer where customer_id=?";     
		jdbcTemplateObject.update( SQL, customer_id);
		return;
	}
	public void update(Integer customer_id,String first_name,String last_name,String email,String address){
		String SQL = "update customer set first_name=?,last_name=?,email,address where customer_id=?";     
		jdbcTemplateObject.update( SQL, customer_id,first_name,last_name,email,address);
		return;
	}
}
