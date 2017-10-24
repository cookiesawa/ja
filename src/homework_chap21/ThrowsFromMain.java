package homework_chap21;
// ppt
import java.util.Scanner;

@SuppressWarnings("serial")
class AgeInputException1 extends Exception{
	public AgeInputException1() {
		super("유효하지 않은 나이가 입력되어있습니다.");
	}
}

public class ThrowsFromMain {
	public static void main(String[] args) throws AgeInputException {
		System.out.println("나이를 입력하세요: ");
		int age = readAge();
		System.out.println("입력하신 나이는" + age + "입니다");
		System.out.println("프로그램 종료.");
	}
	
	public static int readAge() throws AgeInputException{
		Scanner keyboard = new Scanner(System.in);
		int age = keyboard.nextInt();
		
		if (age < 0) {
			throw new AgeInputException();
		}
		return age;
	}
}
