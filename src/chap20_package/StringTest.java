package chap20_package;

import java.util.ArrayList;

public class StringTest {

	public static void main(String[] args) {
		StringTest st = new StringTest();
		st.go();
		

	}

	private void go() {
		lengthCheck();
		System.out.println("----------------------------");
		equalCheck();
		System.out.println("----------------------------");
		compareCheck();
		System.out.println("----------------------------");
		addressCheck();
		System.out.println("----------------------------");
		splitCheck();
		System.out.println("----------------------------");
		trimCheck();
	}
	
	private void trimCheck() {
		System.out.println("# trim() 사용 안 했을 경우");
		String[] strings = new String[] {"a ","b ","c "," ","  d"};
		for(String temp: strings) { 
			// 중간고사  
			// 반드시 글자가 있어야 하는 경우
			// temp != null && temp.trim().length() > 0
			if (temp != null && temp.trim().length() > 0) {
				System.out.println("  [" + temp + "]");
			}
		}
		System.out.println();
		System.out.println("# trim() 사용했을 경우");
		for(String temp: strings) { 
			// 중간고사  
			// 반드시 글자가 있어야 하는 경우
			// temp != null && temp.trim().length() > 0
			if (temp != null && temp.trim().length() > 0) {
				System.out.println("  [" + temp.trim() + "]");
			}
		}
		
				
	}

	private void splitCheck() {
		System.out.println("# Split() 사용하기");
		String text = "  Java technology is both a programming language and a platform.";
		System.out.println("text : " + text);
		String[] array = text.split(" ");
		for(String temp : array) {
			System.out.println("  " + temp);
		}
	}

	private void addressCheck() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울시 구로구 신도림동");
		list.add("서울시 서대문구 남가좌동");
		list.add("경기도 부천시 여월동");
		list.add("서울시 성동구 행당동");
		
		int startCnt=0, endCnt=0, containCnt=0;
		String start = "서울시";
		String end = "동";
		String contain = "성동";
		
		System.out.println("# Startwith() 사용하기");
		for(String address : list) {
			if(address.startsWith(start))
				startCnt++;
			if(address.endsWith(end))
				endCnt++;
			if(address.contains(contain))
				containCnt++;
		}
		System.out.println("  Startwith " + start + " count is = " + startCnt);
		// 수행할 내용 입력하기
		
	}

	private void compareCheck() {
		// 참고 : http://najuung.tistory.com/42
		String text1 = "a";
		String text2 = "b";
		String text3 = "c";
		String text4 = "d";
		
		System.out.println("text1 : " + text1);
		System.out.println("text2 : " + text2);
		System.out.println("text3 : " + text3);
		System.out.println("text4 : " + text4);
		
		System.out.println("# compareTo() 사용하기");
		System.out.println("  "+text2+".compareTo("+text1+") = " + text2.compareTo(text1));
		System.out.println("  "+text1+".compareTo("+text2+") = " + text1.compareTo(text2));
		System.out.println("  "+text1+".compareTo("+text4+") = " + text1.compareTo(text4));
		System.out.println("  "+text4+".compareTo("+text2+") = " + text4.compareTo(text2));
	};
	
	
	private void equalCheck() {
		String text1 = "Seoul";
		//String text2 = "Seoul";
		String text2 = new String("Seoul");
		String text3 = "seoul";
		
		System.out.println("text1 : " + text1);
		System.out.println("text2 : " + text2);
		System.out.println("text3 : " + text3);
		
		System.out.println("# 주소값이 같은 지 묻기");
		if(text1 == text2) // 주소값이 같은 지 묻기
			System.out.println("  text 1의 주소값 == text2의 주소값 result is same.");
		else System.out.println("  text 1의 주소값 == text2의 주소값 result is different.");
		
		System.out.println("# 내용이 같은 지 묻기");
		if(text1.equals(text2)) // 내용이 같은 지 묻기
			System.out.println("  text 1의 내용 == text2의 내용 result is same.");
		else System.out.println("  text 1의 내용 == text2의 내용 result is different.");
		
		System.out.println("# 대소문자는 무시하고 내용이 같은 지 묻기");
		if(text1.equalsIgnoreCase(text3))
			System.out.println("  text 1의 내용 == text3의 내용 result is same.");
		else System.out.println("  text 1의 내용 == text3의 내용 result is different.");
	}

	// null : 문자로 취급하지 않음
	// " " : 공백 한 글자는 문자 1글자로 취급
	private void lengthCheck() {
		// test 할 문자열
		String text = "";
		
		// 문자열의 길이를 확인하는 메소드
		System.out.println("# 문자열의 길이를 확인하는 메소드");
		System.out.println("  text.length()=" + text.length()); 
		System.out.println();
		
		//문자열이 비어 있는지 확인하는 메소드
		System.out.println("# 문자열이 비어 있는지 확인하는 메소드");
		System.out.println("  text.isEmpty()=" + text.isEmpty());
	}
	

}
