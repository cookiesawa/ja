package chap22_homework;

import java.util.*;

public class Programming_06 {
	ArrayList<Student> st = new ArrayList<Student>();
	public static void main(String[] args) {
		Programming_06 st = new Programming_06();
		st.go();		
	}
	private void go() {
		st.add(new Student("김지윤", "경기도 부천시", 216230123));
		st.add(new Student("김효진", "서울특별시 영등포구", 216230088));
		st.add(new Student("김주희", "인천광역시 부평구", 216230086));
		st.add(new Student("장아영", "경기도 부천시", 216230117));
		
		System.out.println("이름순 : " + st);
	}
}
