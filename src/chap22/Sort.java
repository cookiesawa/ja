package chap22;

import java.util.*;

public class Sort {

	public static void main(String[] args) {
		String[] sample = {"i", "walk", "the", "line"};
		List<String> list = Arrays.asList(sample); //배열을 리스트로 바꿈
		Collections.sort(list); // 리스트를 정렬
		System.out.println(list);

	}

}
