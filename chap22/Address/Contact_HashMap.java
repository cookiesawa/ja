package chap22.Address;

import java.io.*;
import java.util.*;

public class Contact_HashMap {
		HashMap<String,Address> hashMap = new HashMap<String,Address>();
		Scanner input = null;
		public static void main(String[] args) {
			new Contact_HashMap().go();
		}
		private void go() {
			input = new Scanner(System.in);
			hashMap = new HashMap<String,Address>();
			getAddress();
//			 System.out.println(hashMap);
			System.out.println("이름으로 검색 하시오: ");
			String key = input.next();
			System.out.println("이름: " + hashMap.get(key).getName() + " 전화번호: " + hashMap.get(key).getNumber() + " 이메일: " + hashMap.get(key).getEmail() + " 주소: " + hashMap.get(key).getAddress());
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
		private void addAddress(String line) {
			String[] tokens = line.split("/");
			Address address = new Address(tokens[0], tokens[1], tokens[2], tokens[3]);
			hashMap.put(address.getName(), address); // hashMap.put(키,값)
			// System.out.println(address,toString());
			
		}

	}
