package homework_chap21;
//ppt
import java.util.Scanner;

@SuppressWarnings("serial")

class AgeInputException extends Exception{
	public AgeInputException() {
		super("유효하지 않은 나이가 입력되어있습니다.");
	}
}

public class HandledByMain {
	public static void main(String[] args) {
		System.out.println("나이를 입력하세요: ");
		int age;
		try {
			age = readAge();
			System.out.println("입력하신 나이는" + age + "입니다.");
		} catch (AgeInputException1 e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료.");
	}

	private static int readAge() throws AgeInputException1{
		Scanner keyboard = new Scanner(System.in);
		int age = keyboard.nextInt();
		
		if (age < 0) {
			throw new AgeInputException1();
		}
		return age;
	}
}
