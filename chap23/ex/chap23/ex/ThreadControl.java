package chap23.ex;

public class ThreadControl {
	
	static void print(String message) {
		String threadName = Thread.currentThread().getName(); // 메세지를 스레드 이름과 함께 출력
		System.out.format("%s: %s%n", threadName, message);
	}
	
	private static class MessageLoop implements Runnable {
		public void run() {
			String messages[] = { "Pride will have a fall.", 
					"Power is dangerous unless you have humility.",
					"Office changes manners.",
					"Empty vessels make the most sounds." };
			
			try {
				for (int i = 0; i < messages.length; i++) {
					print(messages[i]);
					Thread.sleep(2000);
				}
			} catch (InterruptedException e) {
				print("아직 끝나지 않았어요!"); // 인터럽트되면 메세지 출력
			}
		}
	}

	public static void main(String args[]) throws InterruptedException{
		int tries = 0;
		
		print("추가적인 스레드를 시작합니다.");
		Thread t = new Thread(new MessageLoop());
		t.start();
		
		print("추가적인 스레드가 끝나기를 기다립니다.");
		while (t.isAlive()) {
			print("아직 기다립니다.");
			t.join(1000); // 스레드 t가 종료하기를 1초동안 기다린다
			tries++;
			if (tries > 2) {
				print("참을 수 없네요!");
				t.interrupt(); // 스레드 t를 강제로 중단시킨다
				t.join(); // 스레드 t가 종료하기를 기다린다
			}
		}
		print("메인 스레드 종료!");
	}
}
