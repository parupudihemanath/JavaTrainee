package com.drucare;

public class BankB extends Bank{
	private int dollar1;

	public int getDollar1() {
		return dollar1;
	}

	public void setDollar1(int dollar1) {
		this.dollar1 = dollar1;
	}

	
	public void getBalance() {
		System.out.println("$"+dollar1);
		
	}
	public static void main(String args[])
	{
		BankB b2= new BankB();
		b2.setDollar1(150);
		b2.getBalance();
		  
	}
	

}
