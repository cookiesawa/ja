package chap23.thread.ex;

class MyThread extends Thread {
	
	String myName;
	public MyThread(String name) {
		myName = name;
	}
	// Thread가 할 일을 구현하는 메소드
	public void run() {
		for(int i = 10; i >= 0; i--) {
			System.out.println(myName + i);
		}
	}
}
	
public class ThreadTest01 {
	public static void main(String[] args) {
		Thread t1 = new MyThread("Alpha");
		t1.start();
		Thread t2 = new MyThread("Beta");
		t2.start();
	}
}
