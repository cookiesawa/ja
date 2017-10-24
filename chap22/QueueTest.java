package chap22;

import java.util.*;

public class QueueTest {
	public static void main(String args[]) throws InterruptedException {
		int time = 10;
		Queue<Integer> queue = new LinkedList<Integer>(); // Integer을 저장하는 큐를 생성
		// 실제로는 LinkedList 안에 Queue 인터페이스가 구현되어 있음
		for (int i = time; i >= 0; i--)
			queue.add(i);
		while (!queue.isEmpty()) {
			System.out.print(queue.remove()+" ");
			Thread.sleep(1000); // 현재의 스레드를 1초간 재운다
			
		}
	}
}
