package chap22;

import java.util.LinkedHashSet; // 순서대로 출력

public class SetTest_LinkedHashSet {
	public static void main(String args[]) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
			
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese"); 
		set.add("Ham"); 
		set.add("Ham"); 
		
			System.out.println(set);
	}
}
