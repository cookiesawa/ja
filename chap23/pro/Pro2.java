package chap23.pro;

import java.util.Calendar;

public class Pro2 {
	public static void main(String args[]) {
		Thread t1 = new TimeThread("안녕하세요?"); // 생성자
		t1.start();
		Thread t2 = new TimeThread("안녕히 계세요.");
		t2.start();
	}
}// class end

class TimeThread extends Thread {
	// 인스턴스 변수
	String message;
	Calendar cal;
	// 생성자
	public TimeThread (String message) {
		this.message = message;
	}
	// Thread 클래스는 반드시 run() 메소드가 있어야 함: 스레드가 할일!
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			cal = Calendar.getInstance();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			print(cal);
		}
	}// for end
	
	private void print(Calendar d) {
		int year = d.get(Calendar.YEAR); //
		int month = d.get(Calendar.MONTH)+1;
		int date = d.get(Calendar.DATE);
		int hour = d.get(Calendar.HOUR);
		int minute = d.get(Calendar.MINUTE);
		int second = d.get(Calendar.SECOND);
		System.out.println(year + "년" + month + "월" + date + "일" + hour + ":" + minute + ":" + second + ":" + message);	
		
	}
}