package com.drucare;

public class BankC extends Bank{
	
	private int dollar2;

	public int getDollar2() {
		return dollar2;
	}

	public void setDollar2(int dollar2) {
		this.dollar2 = dollar2;
	}

	
	public void getBalance() {
		
		System.out.println("$"+dollar2);
	}
	
public static void main(String args[])
	{
		BankC b3= new BankC();
		  b3.setDollar2(200);
		  b3.getBalance();
	}
	
	

}
