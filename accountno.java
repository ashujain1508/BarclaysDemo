package com.demo;

import java.util.*;
class Account{
	int accountNumber;
	int branchName;
	
	void setAccountNumber(int accountNo) {
		this.accountNumber=accountNo;
		
	}
	int getAccountNumber() {
		return this.accountNumber;
	}
}

public class Employee {
	public static void main(String args[])
	{
		
			Account a = new Account();
			a.setAccountNumber(10000000);
			System.out.println(a.getAccountNumber());
			
	}
		
		
		
	
}
