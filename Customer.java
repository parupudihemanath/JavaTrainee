package com.drucare;

public class Customer
{
   String name;
   String address;
   
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
	
	
}
@Override
public String toString() {
	return "customer [name=" + name + ", address=" + address + "]";
}
    
   
   
   
}
