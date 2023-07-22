package com.drucare;

import java.util.ArrayList;

import java.util.List;

 class Person {

	final Integer id;
	final String firstName;
	final String lastName;
	final String email;
	final String gender;
	final Integer age;

	public Person(Integer id, String firstName, String lastName, String email, String gender, Integer age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public Integer getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
				+ ", email='" + email + '\'' + ", gender='" + gender + '\'' + ", age=" + age + '}';
	}
	
	
//	public static void Find10People()
//	{
//		List<Person> personList= new ArrayList<>();
//		
//	}
//	
//	public void AgeLessThan18()
//	{
//		
//		
//		List<Person>YoungPeople = new ArrayList<>();
//		
//	}
	
//	public static void AllPersons()
//	{
//		
//	}
	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<>();
		personList.add(new Person(1, "konda", "raghu", "raghu@gmail.com", "male", 22));
		personList.add(new Person(2, "siri", "ramya", "ramya@gmail.com", "female", 18));
		personList.add(new Person(3, "priya", "varshini", "varshini@gmail.com", "female", 17));
		personList.add(new Person(4, "madhu", "sudhan", "madhu@gmail.com", "male", 15));
		personList.add(new Person(5, "hari", "raghu", "raghu@gmail.com", "male", 18));
		personList.add(new Person(6, "ravi", "ram", "ravi@gmail.com", "male", 19));
		personList.add(new Person(7, "hari", "krishna", "hari@gmail.com", "male", 16));
		personList.add(new Person(8, "raja", "ravindra", "raja@gmail.com", "male", 17));
		personList.add(new Person(9, "pratyush", "kumar", "kumar@gmail.com", "male", 17));
		personList.add(new Person(10, "praveen", "kumar", "praveen@gmail.com", "male", 17));
		personList.add(new Person(11, "hariram", "kumar", "hariram@gmail.com", "male", 17));
		personList.add(new Person(12, "snathosh", "kumar", "snathosh@gmail.com", "male", 17));
		personList.add(new Person(13, "pratyush", "kumar", "kumar@gmail.com", "male", 17));

		     
		for(Person person:personList)
	       {
		     if(person.getAge()<=18)
		       {     			
			         System.out.println(person);
	           }
	       }
		
		
		System.out.println("----------------");
		
		List<Person> firstpeople = new ArrayList<>();
		 int count=1;
		for(Person person:personList)
	       {    
		     if(person.getAge()<=18&&count<=10)
		       {     			
		    	 //firstpeople.add(person);
			         System.out.println(person);
			         count++;
	           }
	       }
//		for(Person person:firstpeople)
//		{
//			System.out.println(person);
//		}
//		

	}
}
