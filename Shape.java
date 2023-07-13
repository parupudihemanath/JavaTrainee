package com.drucare;

public class Shape {
           
	public void draw(int length)
	{    
		 int area= length*length;
		System.out.println("The area of a square"+ " " +area);
	}
	public void draw(int length, int breadth)
	{
		int area= length* breadth;
		System.out.println("The area of a Rectangle"+ " "+area);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Shape shape= new Shape();
           shape.draw(5);
           shape.draw(3, 5);
	}

}
