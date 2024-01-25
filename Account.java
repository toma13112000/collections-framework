package com.company;
Interface Comparable

import java.util.*;
import java.util.ArrayList;
class Account {
	private String name;
	private double balance;
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
}

class Account implements Comparable<Account> {
	private String name;
	private double balance;

	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name{" + getName() + " balance" + getBalance() + "}";
	}

	@Override
	public int compareTo(Account acc) {
		if (this.balance > acc.balance) {
			return 1;
		}
		else if (this.balance < acc.balance) {
			return -1;
		}
		else  {
			return 0;
		}
}
public class Main {
	public static void main(String[] args) {
		List<Account> acc = new ArrayList<>();
		acc.add(new Account(1, "Tomiris", 150000));
		acc.add(new Account(2, "Said", 200000));
		acc.add(new Account(3, "Deko", 250000));
		acc.add(new Account(4, "Zhanara", 300000));
		Collections.sort(acc);
		System.out.println("After Sorting:  " + acc);
	}
}
 
	/*
		Create and implement:
		1. Constructor
		2. Getters and settters
		3. toString

		Test the Account class. Create multiple objects 
		based on this class and sort them by the name. 
		If names are equal then sort them by descending 
		order of balance. You can use any ways of sorting
		and any ways of creating a collection.
	*/
}