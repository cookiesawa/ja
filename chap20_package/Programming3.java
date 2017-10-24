package chap20_package;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Programming3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] addr = new String[10]; // 배열할건데 그 이름은 addr이야
		ArrayList<Address> addrList = new ArrayList<Address>(); //ArrayList에서 Adderss만 들어가게 할래
		StringTokenizer st = null;
		String str = null; // 주소값이 들어가는 건 null로 초기화
		System.out.println("주소를 입력하세요");
		str = input.nextLine();
		st = new StringTokenizer(str);
		int i = 0;
		while(st.hasMoreTokens()) {
			addr[i] = st.nextToken();
			System.out.print(addr[i] + " ");
			i++;	
		}
		Address address = new Address(addr[0], addr[1], addr[2], addr[3], addr[4], addr[5]);
		addrList.add(address);
		System.out.println("\n ArrayList<Address> 내용 : " + address.toString());
		
	}
}

class Address{
	String zipCode;
	String city;
	String gu;
	String gil;
	String dong;
	String no;
	public Address(String zipCode, String cy, String gu, String dong, String gil, String no) {
		super();
		this.zipCode = zipCode;
		this.city = cy;
		this.gu = gu;
		this.dong = dong;
		this.gil = gil;
		this.no = no; 
	
	}
	
	public String getZipCode() {
		return zipCode;
	}
	public String getCity() {
		return city;
	}
	public String getGu() {
		return gu;
	}
	public String getDong() {
		return dong;
	}
	public String getGil() {
		return gil;
	}
	public String getNo() {
		return no;
	}
	
	//손으로 쓸 줄 알아야해..
	@Override
	public String toString() {
		return "Address [zipCode=" + zipCode + ", city=" + city + ", gu=" + gu + ", gil=" + gil + ", no=" + no + "]";
	}
	
}
