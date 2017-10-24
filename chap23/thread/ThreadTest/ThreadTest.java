package chap23.thread.ThreadTest;

public class ThreadTest {
	public static void main(String args[]) {
		Runnable theJob = new MyRunnable2();
		// 스레드를 생성하고 해야할 일을 매개변수로 줌
		Thread t = new Thread(theJob);
		// 스레드상태가 Runnable 상태: 실행 가능한 상태
		t.start();
		System.out.println("메인스레드");
	}
}// Runnable 인터페이스를 구현한 클래스는 스레드가 해야할 일!!

class MyRunnable2 implements Runnable {
	public void run() {
		go();
	}

	private void go() {
		try {
			Thread.sleep(1000); // 1초간  잠자!
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		doMore();	
	}

	private void doMore() {
		System.out.println("새로운 스레드");
	}
} // class end