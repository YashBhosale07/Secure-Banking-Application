package com.Account.service;

import java.util.List;

import com.Account.model.Customer;

public interface CustomerService {
	
	public List<Customer> showAll();
	
	public Customer findCustomer(int account);
	
	public Customer updateCustomer(Customer c, int account);
	
	public void deleteCustomer(int account);
	
	public Customer addCustomer(Customer c);

	public Customer setSalary(int account, int balance);
	
	
	
}
