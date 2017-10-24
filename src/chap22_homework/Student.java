package chap22_homework;

public class Student{
	String name;
	String address;
	int number;
	
	public Student (String na, String ad, int nu) {
		this.name = na;
		this.address = ad;
		this.number = nu;
	}
	
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String toString() {
		return "student [name = " + name + "address = " + address + "number" + number + "]";
	}
}