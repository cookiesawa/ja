package chap22_book;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetBook {
	TreeSet<Book> ts = new TreeSet<Book>();
	public static void main(String[] args) {
		TreeSetBook tb = new TreeSetBook();
		tb.go();
	}
	private void go() {
		ts.add(new Book("언어의 온도"));
		ts.add(new Book("말의 품격"));
		ts.add(new Book("라틴어 수업"));
		ts.add(new Book("언어의 온도"));
		ts.add(new Book("말의 품격"));
		ts.add(new Book("라틴어 수업"));
		
		System.out.println("원본순 : " + ts); // 중복 제거 된 것.
	}

}



