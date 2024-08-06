package com.Account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Account.model.Customer;
import com.Account.repository.AppRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private AppRepository arr;
	
	
	public List<Customer> showAll(){
		return arr.findAll();
	}
	
	
	public Customer findCustomer(int account) {
		Customer cs = null;
		try {
			cs = arr.findById(account);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return cs;
	}
	
	
	public Customer addCustomer(Customer cm) {
			Customer cs = arr.save(cm);
		return cs;
	
	}
	
	
//	public Customer setSalry(int account, int balance) {
//		
//		
//	}
	
	
	public Customer updateCustomer(Customer cm, int account) {
		
			cm.setBalance(cm.getBalance());
		return arr.save(cm);
	}
	
	public void deleteCustomer(int account) {
		arr.deleteById(account);
	}

	@Override
	public Customer setSalary(int account, int balance) {
		Customer cm= new Customer();
		cm.setBalance(balance);
		return arr.save(cm);
	}
}
