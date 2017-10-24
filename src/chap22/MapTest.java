package chap22;

import java.util.*;

class Student{
	int number;
	String name;
	
	public Student (int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

public class MapTest {

	public static void main(String[] args) {
		Map<String, SortTest> st = new HashMap<String, SortTest>();
		st.put("20090001", new SortTest(20090001, "구준표"));
		st.put("20090002", new SortTest(20090002, "금잔디"));
		st.put("20090003", new SortTest(20090003, "윤지후"));
		
		// 모든 항목을 출력
		System.out.println(st);
		
		// 하나의 항목을 삭제
		st.remove("20090002");
		// 하나의 항목을 대치
		st.put("20090003", new SortTest(20090003, "소이정"));
		// 값을 참조
		System.out.println(st.get("20090003"));
		// 모든 값을 방문
		for (Map.Entry<String, SortTest> s : st.entrySet()) { // Map에 저장된 데이터를 방문할 때는 Map.Entry라는 인터페이스 사용
			String key = s.getKey();
			SortTest value = s.getValue();
			System.out.println("key = " + key + ", value = " + value);
		}

	}

}
