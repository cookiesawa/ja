package chap23.programming;

import java.util.*;

public class Two {

	public static void main(String[] args) {
		Thread t1 = new TimeThread("안녕하세요?");
		t1.start();
		Thread t2 = new TimeThread("안녕히계세요");
		t2.start();

	}

}

class TimeThread extends Thread{
	String message;
	Calendar cal;
	Date da = new Date();

	public TimeThread(String message) {
		this.message = message;
	}

	// Thread가 할 일을 구현하는 메소드로 
	// 반드시 run()메소드가 있어야함 
	public void run() {
		for(int i=0; i<10; i++) {
			cal = Calendar.getInstance();
		try {
			Thread.sleep(1000); // 1초간 잠자!!
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		print(cal);
		
		}
	}
	
	public void print(Calendar d) {
//		int year = d.get(Calendar.YEAR);
//		int month = d.get(Calendar.MONTH)+1;
//		int date = d.get(Calendar.DATE);
//		int hour = d.get(Calendar.HOUR);
//		int minute = d.get(Calendar.MINUTE);
//		int second = d.get(Calendar.SECOND);
//		System.out.println(
//				year + "년" +
//				month + "월" +
//				date + "일" +
//				hour + ":" +
//				minute + ":" +
//				second + message
//		);
		System.out.println(da+" " +message);
	}
	
}



