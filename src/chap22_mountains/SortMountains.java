package chap22_mountains;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {
	LinkedList<Mountain> mtn = new LinkedList<Mountain>();
	class HeightCompare implements Comparator<Mountain>{

		@Override
		public int compare(Mountain one, Mountain two) {
			return one.getHeight() - two.getHeight(); // 높이 순서를 바꾸려면 two - one
		}
		
	}
	public static void main(String[] args) {
		SortMountains sm = new SortMountains();
		sm.go();
	}

	private void go() {
		mtn.add(new Mountain("백두산", 2744));
		mtn.add(new Mountain("한라산", 1950));
		mtn.add(new Mountain("가야산", 1430));
		mtn.add(new Mountain("노고단", 1507));
		mtn.add(new Mountain("토끼봉", 1533));
		System.out.println("원본순 : " + mtn);
		Collections.sort(mtn);
		System.out.println("산이름순 : " + mtn);
		HeightCompare hc = new HeightCompare();
		Collections.sort(mtn, hc); //collections 중요해욤
		System.out.println("산높이순 : " + mtn);
	}

}



