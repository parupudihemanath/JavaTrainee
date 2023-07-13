package com.drucare;

class Pnb extends Rbi
{
	public void getIntrestRate(double amount)
	{
		System.out.println(amount*4.0);
	}
	
	  
	  public  void getWithdrawlLimit(double limit)
	  {
		  if (limit>15000)
		  {
			  System.out.println("you can only withdraw 15000");
		  }
		  else
		  {
			  System.out.println("money withdrawed succesfully");
		  }
	  }
	  
	  public  void minimumBalanceAllowed(double balance)
	  {
		  if(balance<=1000)
		  {
			  System.out.println("Minimum balance is required ");
		  }
	  }	
}
