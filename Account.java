package com.drucare;

public class Account
{
  long accno;
  double balance;
  
  Account(long accno, double balance)
  {
	  this.accno=accno;
	  this.balance=balance;
  }
  
  

public void deposit(double money)
  {
	  balance+=balance;
	  System.out.println("monet has been deposited suuccessfully"+balance);
  }
  public void withDrawl(double money)
  {
	  if(balance+1000>=money)
	  {
		  System.out.println("money withdrawed successfully");
	  }
	  else
	  {
		  System.out.println("!!! Insufficient Balance....!!!");
	  }
  }
  
}
