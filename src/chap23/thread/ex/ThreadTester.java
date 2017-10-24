package chap23.thread.ex;

public class ThreadTester {
	
	public static void main(String[] args) {
		// Thread t1 = new Thread(new MyRunnable2());
		Runnable thejob = new MyRunnable2();
		// 스레드를 생성하고 해야할 일을 매개변수로 줌
		Thread t1 = new Thread(thejob);
		// 스레드 상태가 Runnable 상태 : 실행 가능한 상태 
		t1.start();
		System.out.println("메인스레드");

	}
 
} // 메인 클래스 end

// Runnable 인터페이스를 구현한 클래스는 스레드가 해야할 일!!
class MyRunnable2 implements Runnable{
	public void run() {
		go();
	}
	
	public void go() {
		try {
			Thread.sleep(1000); // 1초간 잠자!!
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// doMore 메소드를 1초 뒤로 미루고
		// 메인스레드가 먼저 찍히게 하기 위해
		// 위의 try catch 구문을 사용
		doMore();
	}
	
	public void doMore() {
		System.out.print("새로운 스레드");
	}
	
} // MyRunnable2 클래스 end


