package com.drucare;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmailIdNotFoundException extends Exception{
	
	EmailIdNotFoundException(String msg)
	{
		super(msg);
		
	}
	
	
	public static void mailNotFoundEXception()
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your mail id");
		String mail = sc.next();
		
		List<String> list = Arrays.asList("hemanath@gmail.com","Raghu@gmail.com","Prasanth@gmail.com","arun@gmail.com");
		
		if(!list.contains(mail))
		{
			try{
				throw new EmailIdNotFoundException("the mails id you are given was not in the list");
			}catch(EmailIdNotFoundException e)
			{
				System.out.println(e);
			}
	}
		else
			System.out.println("mail id is present in the list"+list);
		
		
		
	}

}
