package chap22.pro;

import java.util.*;

public class Student {
	
	String name;
	String number;
	String email;
	String address;
		
	public Student(String name, String number, String email, String address) {
		this.name = name;
		this.number = number;
		this.email = email;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String toString() {
		return "Address [name:" + name + ", number:" + number + ", email:" + email + ", address:" + address + "]";
	}

}


