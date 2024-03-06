package com.programs.mocktest;

public class Account {
	private String name;
	private long accno;
	public double bal;
	Account(String name,long accno){
		this.name=name;
		this.accno=accno;
	}
	public double getBal() {
		return bal;
	}
}
