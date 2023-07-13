package com.drucare;

public class fountainPen extends Pen{
	
	
	 public void write()
	 {
		 System.out.println("write");
	 }
	 public void refill()
	 {
		 System.out.println("refill");
	 }
	  public void changeNib()
	  {
		  System.out.println("changeNIb method");
	  }

	 public static void main(String args[])
	 {
		 fountainPen fp= new fountainPen();
		 
				 fp.write();
				 fp.refill();
				 fp.changeNib();
	 }
}
