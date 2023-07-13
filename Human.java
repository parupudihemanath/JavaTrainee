package com.drucare;

public class Human extends Monkey implements BasicAnimal{

	
	 public void eat()
	 {
		 System.out.println("eat method");
	 }
	 public void sleep()
	 {
		 System.out.println("sleep method");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Human human= new Human();
         human.bite();
         human.jump();
         human.sleep();
         human.eat();
	}

}
