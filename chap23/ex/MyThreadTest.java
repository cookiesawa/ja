//package chap23.ex;
//
//// Thread 클래스에서 상속 받으면 다른 클래스에서 상속 받을 수 없음
//
//class MyThread extends Thread { // MyThread는 Thread를 상속 받음
//	// Thread 클래스는 따로 import할 필요가 없음
//	public void run() { // MyThread 클래스는 하나의 메소드 run()을 가지고 있음
//		// run()은 스레드가 시작되면 자바 런타임 시스템에 의하여 호출 됨
//		// 스레드가 실행하는 모든 작업은 이 run() 메소드 안에 있어야 함
//		for(int i = 10; i >= 0; i--)
//			System.out.print(i + " ");
//	}
//} // 10부터 0 까지 출력
//
//
//public class MyThreadTest {
//	public static void main(String args[]) {
//		Thread t = new MyThread(); // 스레드를 실행시키기 위해 인스턴스 생성 후 
//		t.start(); // start() 호출
//		// start() 메소드를 호출해야만 스레드가 실행
//	}
//}