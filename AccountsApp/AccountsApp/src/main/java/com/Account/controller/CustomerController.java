package com.Account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Account.model.Customer;
import com.Account.service.CustomerService;
import com.Account.service.CustomerServiceImpl;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl csr; 
	
	@GetMapping("/hello")
	public String getHello()
	{
		return "hello";
	}
	
	
	@GetMapping("/cus")
	public List<Customer> getCust(){
		return this.csr.showAll();
	}
	
	
	@GetMapping("/cus/{account}")
	public Customer getCus(@PathVariable("account") int account) {
		return this.csr.findCustomer(account);
	}
	
	@PostMapping("/cus")
	public Customer addCus(@RequestBody Customer customer) {
			System.out.println("Hello");
			return this.csr.addCustomer(customer);
	}
	
	@PutMapping("/set")
	public Customer setbalance(@RequestParam("account") int account,@RequestParam("balance") int balance) {
		
		return csr.setSalary(account, balance);
	}
	
	@PutMapping("/cus/{account}")
	public Customer updateCus(@RequestBody Customer customer,@PathVariable("account") int account) {
		return this.csr.updateCustomer(customer, account);
	}
	
	
	@DeleteMapping("/cus/{account}")
	public void deleteCus(@PathVariable("account") int account) {
		this.csr.deleteCustomer(account);
	}
	
		
}
