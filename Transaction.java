package com.programs.mocktest;

public class Transaction {
    public void desposit(double amt,Account a) {
    	if (amt > 0) {
			a.bal = a.bal + amt;
			System.out.println("deposited avail bal: " + a.bal);
		} else {
			System.out.println("invalid");
		}
    }
    
    public void withdraw(double amt,Account a) {
    	if (a.bal >= amt) {
    	a.bal=a.bal-amt;
    	System.out.println("withdraw success avail bal:"+a.bal);
    	}
    	else {
    		System.out.println("invalid");
    	}
    }
    
    public void checkbal(Account a) {
    	System.out.println(a.bal);
    }
}
