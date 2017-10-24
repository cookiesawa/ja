package chap23.ex;

public class SleepTest {
	public static void main(String args[]) throws InterruptedException { 
		// InterruptedException: sleep()가 다른 메소드에 의하여 중단되면 발생되는 예외로 상위메소드로 전달
		// 사실 여기서는 다른메소드가 sleep()을 방해 할 일이 없음
		String messages[] = { "Pride will have a fall.", 
				"Power is dangerous unless you have humility.",
				"Office changes manners.",
				"Empty vessels make the most sounds." };
		
		for (int i = 0; i < messages.length; i++) {
			Thread.sleep(1000); // 1000밀리 초 동안 실행 중지
			System.out.println(messages[i]);
		}
	}
}
