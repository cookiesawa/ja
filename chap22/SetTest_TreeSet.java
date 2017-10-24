package chap22;

import java.util.TreeSet; // 알파벳 순으로 정렬

public class SetTest_TreeSet {
	public static void main(String args[]) {
		TreeSet<String> set = new TreeSet<String>();
			
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese"); 
		set.add("Ham"); 
		set.add("Ham"); 
		
			System.out.println(set);
	}
}
