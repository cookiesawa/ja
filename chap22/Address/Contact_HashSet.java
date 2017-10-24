package chap22.Address;

import java.io.*;
import java.util.*;

public class Contact_HashSet { // 주소값을 만들어줌
	HashSet<Address> hs = null; // 인스턴스 변수로 사용
	public static void main(String[] args) {
		new Contact_HashSet().go();
	}

	private void go() {
		hs = new HashSet<Address>();
		getAddress();
		System.out.println(hs);
	}

	private void getAddress() {
		try {
			File file = new File("Address.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file)); 
			// 파일에서 올건데 파일리더를 거쳐줘
			String line = null; // 중요 외워
			while( (line = reader.readLine()) != null) {
				addAddress(line);
			}
		}catch (IOException ex) {
			// System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
	}
	private void addAddress(String str) {
		// String.split() 메소드 사용 
		String[] tokens = str.split("/"); // 낱말 하나하나를 배열에 집어 넣을거야
		Address address = new Address(tokens[0], tokens[1], tokens[2], tokens[3]);
		// address 객체 저장해서 hs에 넣음
		hs.add(address);
		
	}
}
