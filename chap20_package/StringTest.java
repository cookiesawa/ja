package chap20_package;

import java.util.ArrayList;

public class StringTest {
	
	public static void main(String[] args) {
		StringTest st = new StringTest();
		st.go();
	}
	
	private void go() {
		lengthCheck();
		equalCheck();
		compareCheck();
		addressCheck();
		splitCheck();
		trimCheck();
		
	}
	
	private void trimCheck() {
		String[] strings = new String[] {"a ","  b"," c "," "};
		for(String temp: strings) {
			if(temp != null && temp.trim().length() > 0) {
				System.out.println("[" + temp.trim() + "]");
				System.out.println("[" + temp + "]");// 반드시 글자가 있어야해, 시험에 낼꺼야
			}
		}		
		
	}

	private void splitCheck() {
		String text="Java technology is both a programming language and a platform.";
		String[] array = text.split(" ");
		for( String temp: array) {
			System.out.println(temp);
		}
		
	}

	private void addressCheck() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울시 구로구 신도림동");
		list.add("경기도 성남시 분당구 정자동");
		list.add("서울시 성동구 행당동");
		int startCnt=0, endCnt=0, containCnt=0;
		String start="서울시";
		String end="동";
		String contain="성동";
		for(String address : list) {
			if(address.startsWith(start)) startCnt++;
			if(address.endsWith(end)) endCnt++;
			if(address.contains(contain)) containCnt++;
		}
		
		System.out.println("StartWith " + start +": " + startCnt);
		// 수행할 내용 입력하기
	}
	
	private void compareCheck() {
		String text1 = "a";
		String text2 = "b";
		String text3 = "c";
		String text4 = "d";
		System.out.println(text2 + ".compareTo(" + text1 + ") = " + text2.compareTo(text1)); 
		System.out.println(text1 + ".compareTo(" + text2 + ") = " + text1.compareTo(text2));
		System.out.println(text1 + ".compareTo(" + text3 + ") = " + text1.compareTo(text3));
		System.out.println(text1 + ".compareTo(" + text4 + ") = " + text1.compareTo(text4));
		System.out.println(text4 + ".compareTo(" + text1 + ") = " + text4.compareTo(text1));
		// 괄호가 없으면 메소드가 아님, out은 일종의 필드
		// compareTo는 정렬 (기준을 잡아서 그거의 앞,뒤/양수냐 음수냐 잘 기억하기)
	}
	
	private void equalCheck() {
		String text1 = "Seoul";
		// String text2 = "Seoul";
		String text2 = "Seoul";
		if(text1 == text2) System.out.println("text1의 주소값 == text2 result is same.");
		else System.out.println("text1의 주소값 == text2의 주소값 result is different.");
		if(text1.equals(text2))System.out.println("text1의 내용 == text2의 내용 result is same.");
		else System.out.println("text1의 내용 == text2의 내용 result is different.");
		String text3 = "Seoul";
		if(text3.equals(text3))System.out.println("text1의 내용 == text3의 내용 result is same.");
		else System.out.println("text1의 내용 == text3의 내용 result is different.");
		
	}
	private void lengthCheck() {
		String text = " ";
		System.out.println("text.length()=" + text.length()); // 글자수 나타냄
		System.out.println("text.isEmpty()=" + text.isEmpty()); //true나 false로 입력
	}

}
