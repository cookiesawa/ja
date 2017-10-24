package chap21.lab;
import java.util.Scanner;
// 사용자 정의 예외처리 클래스
class MyException extends Exception {
	public MyException() {
		super("예외처리 발생시 출력 할 메세지");
	}
}// class end

public class ExMyExceptionTestDrive {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("yes 또는 no를 입력하세요: ");
		String test = input.next();
		// 예외 상황이 발생할 내용이 있음
		try {
			System.out.print("t");
			doRisky(test); // 예외상황이 발생 할 수 있는 메소드
			System.out.print("o");
		}
		// 예외 상황이 발생하면 처리 될 메세지
		catch (MyException me) {
			System.out.print("a");
		//1. System.out.println(me.getMessage());
			me.printStackTrace(); // MyException을 실행시키는 두가지 방법
		}
		finally {
			System.out.print("w");
		}
		System.out.print("s");
	}
	// 예외 상황이 발생 할 수 있는 메소드 선언 방법
	private static void doRisky(String te) throws MyException{
		System.out.print("h");
		if(te.equals("yes")) {
			throw new MyException(); // throw 중요해
		}
		System.out.print("r");
	}// 메소드 끝
	
}// class end
