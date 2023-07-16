package com.drucare;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InvalidEmailIdException extends RuntimeException{
	
	public InvalidEmailIdException(String s)
	{
		super(s);
	}

	
	public static void invalidEmailId()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the mail id");
		String mailid = sc.next();
		List<String> list= Arrays.asList("hemanath@gmail.com","Raghu@gmail.com","Prasanth@gmail.com","arun@gmail.com");
		
		if(!mailid.contains("@"))
		{
			try
			{
			throw new InvalidEmailIdException("the mail id does not belongs to gmail.com as it does not contains  '@' so it belongs to different domain ");
			}catch(InvalidEmailIdException invalidEmailId)
			{
				System.out.println(invalidEmailId);
			}
		}
		else
		{
			System.out.println("Given mail id is valid....");
		}
		
	
	
	}
}
