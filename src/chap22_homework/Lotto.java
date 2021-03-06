package chap22_homework;

import java.util.*;
public class Lotto {
	HashSet<Integer> set = new HashSet<Integer>();
	public Lotto() {
		int d = 0;
		for(int i=0; i<6; i++) {
			do {
				d=(int)(Math.random() * 44.0 + 1.0);
			}while(set.contains(d));
			// true 이면 hashset에 그 값이 포함되어 있다라는 의미이므로
			// 중복이 허용되지 않으므로 false 일때까지 반복
			set.add(d);
		}
	}
	
	@Override
	public String toString() {
		return "Lotto [set=" + set + "]";
	}

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		System.out.println(lotto.toString());
	}

}
