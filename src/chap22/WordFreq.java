package chap22;

import java.util.*;

public class WordFreq {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>(); // Map객체 생성
		
		String[] sample = {"to", "be", "or", "not", "to", "be", "is", "a", "problem"};
		// 문자열에 포함된 단어의 빈도를 계산
		for (String a : sample) {
			// 단어를 꺼내서 빈도를 증가 시킴
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq + 1); 
		}
		
		System.out.println(m.size() + "단어가 있습니다.");
		System.out.println(m.containsKey("to"));
		System.out.println(m.isEmpty());
		System.out.println(m);
	}

}
