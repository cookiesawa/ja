package homework_chap21;
// LAB 1
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileErrorTest {
	public static void main(String[] args){
		try{
			Scanner in = new Scanner(new File("data.txt"));
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		finally {
			System.out.println("프로그램 종료");
		}
	}
}
