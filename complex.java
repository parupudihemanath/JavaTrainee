package com.drucare;

import java.util.Scanner;

public class complex
{
	
	 
	public void sum(int r, int i)
	{
		System.out.println("The sum Is" + (r+i));
	}
	public void product(int r, int i)
	{
		System.out.println("The Product Is" + (r*i));
	}
	public void difference(int r, int i)
	{
		System.out.println("The difference is" + (i-r)*1);
	}
	
	public static void main(String[] args)
	{
		
		complex c= new complex();
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the real number");
		 int r=sc.nextInt();
		 System.out.println("enter the img number");
		 int i=sc.nextInt();
		c.sum(r, i);
		c.product(r, i);
		c.difference(r, i);
		

	}

}
