package chap22;

import java.util.HashSet; // 랜덤으로 출력

public class SetTest_HashSet {
	public static void main(String args[]) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese"); 
		set.add("Ham"); 
		set.add("Ham"); 
		
		System.out.println(set);
	}
}
