package chap22;

import java.util.*;

class Students implements Comparable <Students> {
	int number;
	String name;
	
	public Students(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public int compareTo(Students s) {
		return number - s.number; // 객체를 서로 비교하는 메소드
	}
}

public class SortTest{
	public static void main(String[] args) {
		Student array[] = {
				new Student(20090001, "김철수"),
				new Student(20090002, "이철수"),
				new Student(20090003, "박철수")
		};
		List<Student> list = Arrays.asList(array);
//		Collections.sort(list);// 정렬하는 도중에 compareTo() 사용
		// Collections.sort(list, Collections.reverseOrder()) 은 역순정렬
		System.out.println(list);
	}
}
