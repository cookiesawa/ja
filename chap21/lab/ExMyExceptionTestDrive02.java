package chap21.lab;
import java.util.Scanner;
class MyException2 extends Exception {
	public MyException2() {
		super("예외처리 발생");
	}
}// class end

public class ExMyExceptionTestDrive02 {
	public static void main(String args[]) throws MyException2{
		Scanner input = new Scanner(System.in);
		System.out.println("yes 또는 no를 입력하세요: ");
		String test = input.next();
			
			System.out.print("t");
			doRisky(test); // 예외상황이 발생 할 수 있는 메소드
			System.out.print("o");
			System.out.print("a");
			System.out.print("w");
			System.out.print("s");
	}
		// 예외 상황이 발생 할 수 있는 메소드 선언 
	private static void doRisky(String te) throws MyException2{
		System.out.print("h");
		if(te.equals("yes")) {
			throw new MyException2(); // throw 중요해
		}
		System.out.print("r");
	}// 메소드 끝
		
}// class end


