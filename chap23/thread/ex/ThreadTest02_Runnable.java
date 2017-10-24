package chap23.thread.ex;

class MyRunnable implements Runnable{

	String name;
	public MyRunnable(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i = 10; i >= 0; i--) {
			System.out.println(name + i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadTest02_Runnable {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable("Alpha"));
		t1.start();
		Thread t2 = new Thread(new MyRunnable("Beta"));
		t2.start();
	}
}
