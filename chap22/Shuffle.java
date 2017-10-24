package chap22;

import java.util.*;

public class Shuffle {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++)
			list.add(i);
		Collections.shuffle(list); //순서를 무작위로
		System.out.println(list);
	}
	
	
}
