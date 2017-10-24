package chap22.Address;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Contact_ArrayList_FileReader {
	ArrayList<Address> AddressList = new ArrayList<Address>();
	public static void main(String[] args) {
		Contact_ArrayList_FileReader address = new Contact_ArrayList_FileReader();
		address.go();
	} // 여기가 중요@!!!!!
	private void go() {
		getAddress(); // 출력
		System.out.println("원본순: " + AddressList);
	}
	private void getAddress() {
		try {
			File file = new File("Address.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null; //0를 쓰면 안됨 주소값이 됨
			while( (line = reader.readLine()) != null) {
				addAddress(line);
			}
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	private void addAddress(String parseline) {
		String[] tokens = parseline.split("/"); // split가 하는일은 하나씩 꺼내서 배열에 저장하는 일
		Address nextAddress = new Address(tokens[0], tokens[1], tokens[2], tokens[3]);
		AddressList.add(nextAddress);
		System.out.println(nextAddress.toString());		
	}
}
