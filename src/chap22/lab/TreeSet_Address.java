package chap22.lab;

import java.io.*;
import java.util.*;

public class TreeSet_Address {
	TreeSet<Address> tree = null;
	// TreeSet 객체의 초기값은 null
	// 인스턴스 변수는 자기가 임의로 초기값을 가지고 있음
	public static void main(String[] args) {
		new TreeSet_Address().go();
	}
	private void go() {
		// 로컬 변수는 초기값을 반드시 지정해주어야함
		tree = new TreeSet<Address>();
		getAddress();
		System.out.println(tree);
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
		tree.add(address);
	}

}
