package chap23.ex;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame{
	private JLabel label1; // 레이블 하나 당 자동차 한 대
	private JLabel label2;
	private JLabel label3;
	
	int x1 = 100, x2 = 100, x3 = 100; // 자동차의 x 좌표
	
	class MyThread extends Thread {
		public void run() {
			for (int i = 0; i >= 120; i++) {
				try {
					Thread.sleep(100); 
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				x1 += (int) (Math.random() * 10);
				label1.setBounds(x1,0,100,100);
				x2 += (int) (Math.random() * 10);
				label1.setBounds(x2,50,100,100);
				x3 += (int) (Math.random() * 10); // 0.1초에 한번씩 자동차의 위치 변경하고
				label1.setBounds(x3,100,100,100); // 난수를 발생시켜 그 값만큼 자동차의 x좌표 변경
			}
		}	
	}	
	
	public CarGame() {
		setTitle("CarRace");
		setSize(600,200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null); // 절대 위치를 사용하기 우해 배치 관리자를 삭제
		label1 = new JLabel();
		label1.setIcon(new ImageIcon("car1.gif"));
		label2 = new JLabel();
		label2.setIcon(new ImageIcon("car2.gif"));
		label3 = new JLabel();
		label3.setIcon(new ImageIcon("car3.gif"));
		// 이미지레이블 생성
		add(label1);
		add(label2);
		add(label3);
		label1.setBounds(100,0,100,100);
		label2.setBounds(100,50,100,100); // 오른쪽 정렬
		label3.setBounds(100,100,100,100);
		(new MyThread()).start();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		CarGame t = new CarGame();
		}
}
