package com.drucare;

public class BankA extends Bank {

	 private int dollar;
	 
	 public int getDollar() {
			return dollar;
		}
		public void setDollar(int dollar) {
			this.dollar = dollar;
		}

	
    
	public void getBalance() {
		
		System.out.println("$"+ dollar );
	}
	public static void main(String args[])
	{
		BankA b1= new BankA();
		b1.setDollar(100);
		b1.getBalance();
		
		  
	}
	
	
	
}
