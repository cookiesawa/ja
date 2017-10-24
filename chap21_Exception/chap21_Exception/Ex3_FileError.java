package chap21_Exception;

import java.io.*;

public class Ex3_FileError {
   private int[] list; //인스턴스변수와 마찬가지
   private static final int SIZE= 10;
   
   public static void main(String[] args) {
      Ex3_FileError ex3 = new Ex3_FileError();
   }
   
   public Ex3_FileError() { //생성자
      list = new int[SIZE];
      try {
         for(int i = 0; i <= SIZE; i++) 
            list[i] = i;
      	} catch(ArrayIndexOutOfBoundsException arr) {
//         System.out.println(arr.getMessage());
         arr.printStackTrace();
      }
      writeList();
   }
   
   private void writeList() {
      PrintWriter pw = null; //out이라는 이름만 가지고 있다.
      try {
         pw = new PrintWriter(new FileWriter("outfile.txt")); 
         for(int i = 0; i < SIZE; i++) {
            pw.println("배열원소" + i + "=" + list[i]);
         }
      }catch(ArrayIndexOutOfBoundsException e) { //더 디테일한 Exception을 볼 수 있음
         //배열 인덱스 오류가 발생하면 실행
         System.out.println(e.getMessage());
      } catch (IOException e) { //입출력 오류가 발생하면 실행
         System.out.println(e.getMessage());
      }finally { //try블록이 종료되면 항상 실행되어서 자원을 반납
         if(pw != null) { //PrintWriter 출력 스트림이 연결되어 있으면
            pw.close();
         }
      }
   }//WriteList() end
} //class end