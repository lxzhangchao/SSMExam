package com.hand.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.model.Customer;
import com.hand.service.impl.CustomerServiceImpl;

public class Customerservicet {
	public List<Customer> index(){
		List<Customer> al=new ArrayList<Customer>();
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("servlet-context.xml");
		CustomerServiceImpl fs = 
				(CustomerServiceImpl)context.getBean("customerService"); 
		al=fs.listCustomers();
		//mav.add(al);
		return al;
	}
}
