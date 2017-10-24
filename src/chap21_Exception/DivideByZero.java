package chap21_Exception;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("두개의 정수를 입력하세요 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		try {
			System.out.println(num1 + " / " + num2 + " = " + num1/num2);
		}
		catch(ArithmeticException ae) {
			// System.out.println(ae.getMessage());
			ae.printStackTrace(); // 위에꺼와 같은 뜻		
		}
		finally { //에러가 있거나 없거나 실행
			System.out.println("프로그램 종료");
		}
	}

} // class 끝
