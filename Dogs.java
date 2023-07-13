package com.drucare;

public class Dogs extends Animals{
	
	 public void dogs()
	 {
		 System.out.println("Dogs Bark");
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dogs dogs = new Dogs();
        dogs.dogs();
        dogs.cats();
	}


	@Override
	public void cats() {
		System.out.println("cats");
		
	}

}
