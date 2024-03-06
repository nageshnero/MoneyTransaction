package com.programs.mocktest;

public class PhonePay implements BankUser {
	@Override
	public void transactions(double amt, Account a, int choice) {
		 Transaction t=new Transaction();
		switch(choice) {
		case 1:{
			  t.desposit(amt, a);
		}
		break;
		case 2:{
			t.withdraw(amt, a);
		}
		break;
		case 3:{
			t.checkbal(a);
		}
		break;
		default:{
			System.out.println("invalid");
		}
		}
	}
	public void Send(double amt) {
		System.out.println("amt sent success");
	}
	public void Receive() {
		System.out.println("amt sent received success");
	}


}
