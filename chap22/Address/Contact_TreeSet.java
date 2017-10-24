package chap22.Address;

import java.io.*;
import java.util.*;

public class Contact_TreeSet { //중복이 안됨
	TreeSet<Address> tree = null;
	public static void main(String[] args) {
		new Contact_TreeSet().go();
	}

	private void go() {
		tree = new TreeSet<Address>();
		getAddress();
		System.out.println(tree);
	}

	private void getAddress() {
		try {
			File file = new File("Address.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
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
		tree.add(address);
	}
}
