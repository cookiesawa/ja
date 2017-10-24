package chap21_Exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex3_FileError {
	private int[] list;
	private static final int SIZE = 10;
	
	public static void main(String[] args) {
		Ex3_FileError ex3 = new Ex3_FileError();
	}
	public Ex3_FileError() { //생성자
		list = new int[SIZE];
		try {
			for(int i = 0; i <= SIZE; i++) list[i] = i;
		}
		catch(ArrayIndexOutOfBoundsException arr) {
			// System.out.println(arr.getMessage());
			arr.printStackTrace();
		}
		writeList();
	}
	public void writeList() {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter("outfile.txt"));
			for(int i = 0; i < SIZE; i++)
				pw.println("배열 원소" + i + " = " + list[i]);
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.print(e.getMessage());
		}
		catch(IOException e) {
			System.out.print(e.getMessage());
		}
		finally {
			if(pw != null) { // PrintWriter 출력 시트림이 연결 되어 있으면 
				pw.close();
			}
		}
	} // writeList() end
} // class end
