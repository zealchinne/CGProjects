package com.jojuskills.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Customer {
	
	private int accountno;  
	private String customername;  
	private String accounttype;  
	private double balance;  

}
