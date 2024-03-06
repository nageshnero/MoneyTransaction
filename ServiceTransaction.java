package com.programs.mocktest;

public class ServiceTransaction {
       public BankUser Login(int pin) {
    	   BankUser b=null;
    	   if(pin==1111) {
    		   b=new Atm();
    	   }
    	   else if(pin==2222) {
    		   b=new PhonePay();
    	   }
    	   else if(pin==3333) {
    		   b=new Gpay();
    	   }
    	   else {
    		   System.out.println("invalid");
    	   }
		return b;
    	   
       }
}
