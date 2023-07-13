package com.drucare;

import java.util.Scanner;

public class Rectangle {

	int length;
	int breadth;

	 Rectangle(int length, int breadth) {

		this.length = length;
		this.breadth = breadth;
	}

	public void Area() {

		int area= length * breadth;
            System.out.println(area);
	}

	public static void main(String args[]) {

		Rectangle r1 = new Rectangle(4, 5);
		r1.Area();
		//System.out.println(r1.Area());

		Rectangle r2 = new Rectangle(5, 8);
		r2.Area();
		//System.out.println(r2.Area());

	}
}
