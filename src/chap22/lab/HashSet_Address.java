package chap22.lab;

import java.io.*;
import java.util.*;

public class HashSet_Address {
	HashSet<Address> st = null;
	public static void main(String[] args) {
		new HashSet_Address().go();
	}
	private void go() {
		st = new HashSet<Address>();
		getAddress();
		System.out.println(st);
	}
	private void getAddress() {
		try {
			File file = new File("address.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null; // String은 null값
			while((line = br.readLine()) != null) {
				addAddress(line);
			}
		}catch(IOException ex) {
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	private void addAddress(String str) {
		String[] tokens = str.split("/");
		// 반드시 String이어야만 하는 건 아니므로 변형을 원하면 변형
		// int token2 = Integer.parseInt(tokens[2]);
		Address address = new Address(tokens[0],tokens[1],tokens[2]);
		// Integer.parseInt(tokens[1]) 
		st.add(address);
	}

}
