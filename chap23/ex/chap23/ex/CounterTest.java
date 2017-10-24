package chap23.ex;

class Counter {
	private int value = 0;
	public void increment() { value++; }
	public void decrement() { value--; }
	public void printCounter() { System.out.println(value); }
} // 카운터 정의

class MyThread extends Thread {
	Counter sharedCounter;
	
	public MyThread(Counter c) {
		this.sharedCounter = c; // 공유된 counter객체의 참조값 저장
	}
	
	public void run() {
		int i = 0;
		while (i < 20000) {
			sharedCounter.increment();
			sharedCounter.decrement();
			// 증가했다가 감소시키기 때문에 카운터의 값은 변화가 없어야 함
			if (i % 40 == 0)
				sharedCounter.printCounter(); // 가끔 카운터의 값을 출력해보자
			try {
				sleep((int) (Math.random() * 2)); // 난수 시간만큼 스레드 중지
			} catch (InterruptedException e) { }
			i++;
		}
	}
}

public class CounterTest {
	public static void main(String[] args) {
		Counter c = new Counter(); // 공유 카운터 객체 생성
		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();
		// 확실히 잘못된 결과를 내기 위해 스레드 4개 생성
	}
}