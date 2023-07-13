package com.drucare;

public class Cats extends Animals {

	 public void cats()
	 {
		 System.out.println("Cats Meow");
	 }
	  public void dogs()
	  {
		  System.out.println("dogs");
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Cats cats = new Cats();
          cats.cats();
          cats.dogs();
	}

	

}
