package chap23.thread.ex;

import java.awt.*;
import javax.swing.*;

public class CountDownTest extends JFrame {
	// 인스턴스 변수
	private JLabel label;
	// 내부클래스로 Thread 클래스 작성
	
	class MyThread extends Thread { // 스레드를 내부클래스로 만들면 필드에 접근이 쉬워짐
		public void run() {
			for (int i = 10; i >= 0; i--) {
				try {
					Thread.sleep(1000); // sleep()은 도중에 예외가 발생할 가능성이 있음
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i + ""); // 1초가 지나면 레이블의 텍스트 변경
			}
		}
	} // 내부 클래스 end
	// 생성자
	public CountDownTest() {
		setTitle("카운트다운");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("Start");
		label.setFont(new Font("Serif", Font.BOLD,100));
		add(label);
		(new MyThread()).start(); // 스레드 시작
		setVisible(true);
	} // 생성자 end
	
	public static void main(String[] args) {
		CountDownTest t = new CountDownTest();
	}

}
