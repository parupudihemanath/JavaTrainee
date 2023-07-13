package com.drucare;

public class BankTest {
	public static void main(String args[])
	{
		Customer c1 = new Customer();
		Customer c2 = new Customer();

		c1.setName("prasanth");
		c1.setName("raghu");
		c2.setAddress("hyd");
		c2.setAddress("vizag");
		System.out.println();
		System.out.println(c1);
		System.out.println(c2);
		
		
		Account accOne = new Account(2335647,60000);
		accOne.deposit(2000);
		Account accTwo = new Account(3000232,5000);
		accTwo.deposit(4000);

		
		System.out.println("sbi details");
		Sbi sbi = new Sbi();
		sbi.getIntrestRate(100000);
		sbi.getWithdrawlLimit(12000);
		sbi.minimumBalanceAllowed(10000);
		
		System.out.println("PNB details");

		Pnb pnb = new Pnb();
		pnb.getIntrestRate(1000);
		pnb.getWithdrawlLimit(12000);
		pnb.minimumBalanceAllowed(3000);
		

		
	}

}
