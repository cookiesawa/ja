package practice;

import java.util.*;

public class SortMountain{
	LinkedList<Mountain> mtn = new LinkedList<Mountain>();
	class HeightCompare implements Comparator<Mountain>{
		
		@Override 
		public int compare(Mountain one, Mountain two) {
			return two.getHeight() - one.getHeight();
		}
	}
	
	public static void main(String[] args) {
		SortMountain sm = new SortMountain();
		sm.go();
	}
	
	private void go() {
		mtn.add(new Mountain("백두산",2744));
		mtn.add(new Mountain("한라산", 1950));	
		mtn.add(new Mountain("가야산", 1430));	
		mtn.add(new Mountain("노고단", 1507));	
		mtn.add(new Mountain("토끼봉", 1538));
		System.out.println("원본순: " + mtn);
		
		Collections.sort(mtn);
		System.out.println("산이름순: " +mtn);
		
		HeightCompare hc = new HeightCompare();
		Collections.sort(mtn,hc);
		System.out.println("산높이순: " + mtn);
	}
}