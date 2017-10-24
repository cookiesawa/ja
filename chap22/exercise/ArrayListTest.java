package chap22.exercise;

import java.util.*;

public class ArrayListTest {
	public static void main(String args[]) {
		ArrayList<Double> list = new ArrayList<>(); 
		
		list.add(3.5);
		list.add(4.0);
		list.add(1.7);
		
		for (Double a : list)
			System.out.println(a);
		
		Iterator<Double> li = list.iterator();
		
		while(li.hasNext())
			System.out.println(li.next());
		
	
		
	}
}

// 몰라ㅏㅏ몰라ㅏ