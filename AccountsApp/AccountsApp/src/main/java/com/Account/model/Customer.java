package com.Account.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Component
public class Customer {
		@Id
		private int accountno;
		
		private String name;
		
		private int balance;

		public Customer(int accountno, String name, int balance) {
			super();
			this.accountno = accountno;
			this.name = name;
			this.balance = balance;
		}

		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getAccountno() {
			return accountno;
		}

		public void setAccountno(int accountno) {
			this.accountno = accountno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}
		
		
		
		
		
		
}
