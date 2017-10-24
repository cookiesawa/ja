package chap22.lab;

public class Address implements Comparable<Address> {
	// 정렬을 추가 <> 제너릭 형태 
	// 인스턴스 변수 3개
	String name;
	String addr;
	String cellphone;
	// 생성자
	public Address(String name, String addr, String cellphone) {
		super();
		this.name = name;
		this.addr = addr;
		this.cellphone = cellphone;
	}
	// set,get
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	
	// toString
	@Override
	public String toString() {
		return "Address [name=" + name + ", addr=" + addr + ", cellphone=" + cellphone + "]\n" ;
	}
	
	// String.compareTo()메소드 treeSet
	@Override
	public int compareTo(Address other) {
		return this.name.compareTo(other.getName());
	}
	
	// 중복 방지 treeSet
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	// String.equals()메소드 treeSet
	@Override
	public boolean equals(Object other) {
		// object를 Adress로 형변환
		Address two = (Address) other;
		return this.name.equals(two.getName());
	}
	
	
	

}
