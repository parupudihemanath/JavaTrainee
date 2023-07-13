package com.drucare;

public class employee extends manager
{
	
	public static void main(String[] args)
	{
       manager m= new manager();
       employee e = new employee();
       m.name="varun";
       m.age=35;
       m.phno="8453456456";
       m.adress="hyderabad";
       m.specilization="sr engineer";
       m.department="software";
       m.printSalary(80000);
       System.out.println(m.name+" "+m.age+" "+m.phno+" "+m.adress+" "+m.specilization+" "+m.department);
       
		
		e.name="arun";
		e.age=25;
		e.phno="96666324324";
		e.adress="vizag";
		e.specilization="jr engineer";
		e.department="software";
		e.printSalary(25000);
		System.out.println(e.name+" "+e.age+" "+e.phno+" "+e.adress+" "+e.specilization+" "+e.department);
  }
}