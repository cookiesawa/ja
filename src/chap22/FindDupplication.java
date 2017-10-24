package chap22;

import java.util.HashSet;
import java.util.Set;

public class FindDupplication {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>(); // 원소를 저장해서 성능에서 가장 우수함. 그러나 순서가 일정하지 않음
		String[] sample = {"단어", "중복", "구절", "중복"};
		for (String a : sample)
			if(!s.add(a))
				System.out.println("중복된 단어" + a);
		System.out.println(s.size() + "중복되지 않은 단어 : " + s);
	}
}
