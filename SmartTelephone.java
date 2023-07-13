package com.drucare;

public class SmartTelephone extends Telephone{

	public void lift()
	{
		System.out.println("lift");
	}
	
	public void engage()
	{
		System.out.println("engage");
	}
	public void disconnected()
	{
		System.out.println("disconnected");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             SmartTelephone smrttlphn= new SmartTelephone();
             smrttlphn.lift();
             smrttlphn.engage();
             smrttlphn.disconnected();
	}

}
