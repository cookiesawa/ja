package chap20_calendar;

//static일때

import java.util.Calendar;

public class Test01_1 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); //
		System.out.println(calendar);
		Test01_1.printCalendar(calendar);
		calendar.set(2017,8,5);
		Test01_1.printCalendar(calendar);
	}
	public static void printCalendar(Calendar cal) {
		System.out.println(cal.get(Calendar.YEAR)+"년 ");
		System.out.println(cal.get(Calendar.MONTH)+ 1+"월 ");
		System.out.println(cal.get(Calendar.DATE)+"일 ");
		System.out.println(cal.get(Calendar.HOUR)+"시 ");
		System.out.println(cal.get(Calendar.MINUTE)+"분 ");
		System.out.println(cal.get(Calendar.SECOND)+"초 ");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"요일 ");
		String[] days = {"일","월","화","수","목","금","토"};
		int i = cal.get(Calendar.DAY_OF_WEEK);
		System.out.print(days[i-1] + "요일" + "\n");
		
	}
}


