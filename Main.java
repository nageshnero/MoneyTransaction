package com.programs.mocktest;

public class Main {
	public static void main(String[] args) {
		Account a=new Account("nagesh", 9877382l);
		ServiceTransaction s=new ServiceTransaction();
		BankUser b=s.Login(1111);
		    b.transactions(8000, a, 1);
		    b.transactions(3000, a, 2);
		
	    BankUser b1=s.Login(2222);
		    b1.transactions(9000, a, 1);
		    b1.transactions(5000, a, 2); 
		    
		BankUser b3=s.Login(3333);
		    b3.transactions(8000, a, 1);
		    b3.transactions(4000, a, 2);
		      
	}

}
