package chap22;

import java.util.*;

class Student implements Comparable<Student> {
	int number;
	String name;
	
	public Student (int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	// 객체를 서로 비교하려고
	@Override
	public int compareTo(Student s) {
		return number - s.number;
	}

}


public class SortTest {
	public SortTest(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Student array[] = {
				new Student(20090001, "김철수"),
				new Student(20090002, "이철수"),
				new Student(20090003, "박철수"),
		};
		List<Student> list = Arrays.asList(array);
		Collections.sort(list);
		System.out.println(list);
	}

}
