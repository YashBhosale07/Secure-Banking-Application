package com.Account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Account.model.Customer;

public interface AppRepository extends JpaRepository<Customer, Integer>{

		public Customer findById(int Id);
		
}
