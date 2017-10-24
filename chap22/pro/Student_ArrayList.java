package chap22.pro; // p577, 6번

import java.util.*;

public class Student_ArrayList extends Student{
	
		public Student_ArrayList(String name, String number, String email, String address) {
		super(name, number, email, address);

	}

		public static void main(String args[]) {
			ArrayList<String> list = new ArrayList<String>(); // String 타입의 객체를 저장할 수 있는 ArrayList 객체 생성
			
			
			list.add("김효진");
			list.add("01059157884");
			list.add("gywls7884@naver.com");
			list.add("신도림역"); 
			list.set(3, "대림역"); 
			list.remove(2); 
			
			for (String a : list)
				System.out.println(a);
			
		}
	}


//모르겟엏ㅎㅎ