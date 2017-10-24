package chap23.thread.ex;

import java.awt.*;
import javax.swing.*;

public class CountDownTest extends JFrame{
	private JLabel label;
	// 내부클래스로 Thread 클래스 작성
	class MyThread extends Thread{
		public void run() {
			for(int i = 10; i >=0; i--) {
				System.out.println(i + " ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				label.setText(i +"");
			}
		}
	} // 내부 클래스 end
	//생성자
	public CountDownTest() {
		setTitle("카운트다운");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("Start");
		label.setFont(new Font("SErif", Font.BOLD, 100));
		add(label);
		(new MyThread()).start();
		setVisible(true);
	} // 생성자 end

	public static void main(String[] args) {
			CountDownTest t = new CountDownTest();
	}

}
