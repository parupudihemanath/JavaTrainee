package com.drucare;

public class Student 
{
	
	
	Student(String str1)
	{
		if (str1==null)
		{
			System.out.println("unknown");
		}
		else
			
		System.out.println(str1);
	}
	
   public static void main(String args[])
   {
	   Student s1= new Student(null);
	   Student s2= new Student("hema");
	   Student s3= new Student("nath");
	   Student s4= new Student("arun");
	   
	   
   }
}
