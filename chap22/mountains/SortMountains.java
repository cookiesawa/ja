package chap22.mountains;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains{
	LinkedList<Mountain> mtn = new LinkedList<Mountain>(); //<>이게 제네릭이고 linkedlist생성한거임
	class HeightCompare implements Comparator<Mountain>{

		@Override
		public int compare(Mountain one, Mountain two) {
			// return one.height - two.height;
			// return one.getHeight() - two.getHeight(); // 낮은순
			return two.getHeight() - one.getHeight(); // 높은순
		}
		
	}
	public static void main(String[] args) {
		SortMountains sm = new SortMountains();
		sm.go(); //메소드
	}

	private void go() { //메소드 정의
		mtn.add(new Mountain("백두산", 2744));
		mtn.add(new Mountain("한라산", 1950));	
		mtn.add(new Mountain("가야산", 1430));	
		mtn.add(new Mountain("노고단", 1507));	
		mtn.add(new Mountain("토끼봉", 1538));	
		System.out.println("원본순: " + mtn);
		
		Collections.sort(mtn); //comparable interface 구현(Mountain.java에 implements해줌
		System.out.println("산이름순: " + mtn);
		
		HeightCompare hc = new HeightCompare();
		Collections.sort(mtn, hc);
		System.out.println("산높이순: " + mtn);
		
	}
	

}
