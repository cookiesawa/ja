package chap22.Address;

public class Address implements Comparable<Address>{
	String name;
	String number;
	String email;
	String address;
	
	public Address(String name, String number, String email, String address) {
		super();
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

	@Override
	public String toString() {
		return "Address [name=" + name + ", number=" + number + ", email=" + email + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Address one) {
		// string.compareTo()메소드
		return this.name.compareTo(one.getName());
	}

	@Override
	public int hashCode() { // 객체가 같지 않아야할 조건 
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) { // 객체의 값이 같으냐
		Address address = (Address)obj; // obj로 들어온 애를 Address로 형변환 해줘
		return name.equals(address.getName()); // String이 가지고 있는 equals메소드
	}
}
