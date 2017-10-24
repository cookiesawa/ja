package chap23.ex;

// Runnable 인터페이스는 다른 클래스를 상속 받을 수 있음

class MyRunnable implements Runnable { // Runnable을 구현하는 클래스 작성
	public void run() { // run()메소드를 재정의
		for (int i = 10; i >= 0; i--)
			System.out.print(i + " ");
	}
}

public class MyRunnableTest {
	public static void main(String args[]) {
		Thread t = new Thread(new MyRunnable()); // Thread 클래스의 인스턴스 생성하고
		// Runnable 객체를 Thread 생성자의 매개변수로 넘김
		t.start(); // Thread객체의 start() 메소드 호출
	}
}
