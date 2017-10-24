//package chap23.ex;
//
//class MyRunnable implements Runnable { 
//	String myName;
//	public MyRunnable(String name) { myName = name; } // 스레드를 구분하기 위해 이름 설정
//	public void run() { 
//		for (int i = 10; i >= 0; i--)
//			System.out.print(i + " ");
//	}
//}
//
//public class TestThread {
//	public static void main(String args[]) {
//		Thread t1 = new Thread(new MyRunnable("A"));
//		Thread t2 = new Thread(new MyRunnable("B"));
//		t1.start(); 
//		t2.start();
//	}
//}
