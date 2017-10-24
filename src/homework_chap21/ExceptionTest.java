package homework_chap21;

import java.util.Scanner;

// LAB 2
public class ExceptionTest {
	public static void main(String[] args) {
		//int[] = list;
		int sum = 0, count;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수의 개수: ");
		count = sc.nextInt();
		
		int[] list;
		try{ //배열의 크기가 음수일 때
			list = new int[count];
		} catch(NegativeArraySizeException s){
			list = new int[3];
			count = 3;
		}
		
		for(int i = 0; i<count; i++){
			System.out.println("정수를 입력하시오: ");
			list[i]=sc.nextInt();
			if(list[i]<0) //배열 안의 값이 음수값이 들어갈때
				list[i]=0;
		}
		for(int i=0; i<count; i++){
			sum+=list[i];
		}
		try{//어떤 수를 0으로 나눌때
			System.out.println("평균은" + sum/count);
		} catch(ArithmeticException e){
			System.out.println("평균은 0");
		}
	}
}
