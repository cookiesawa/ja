package homework_chap21;

import java.util.Scanner;
// PROGRAMMING 2

class choice{
	 int num;
	 public void number(){
	  num=(int)(Math.random()*3);
	 }
	 public void number(int n){
	  num=n;
	 }
	 public int getValue(){
	  return num;
	 }
	 }
	 public class Game{
	  public static void main(String[] args){
	   choice man = new choice();
	   choice com = new choice();
	   Scanner sc = new Scanner(System.in);
	   int a;
	   System.out.print("하나를 선택하시요 : 가위(0), 바위(1), 보(2) : ");
	   a=sc.nextInt();
	   man.number(a);
	   com.number();
	   switch(com.getValue()){
	   case 0:
	    System.out.println("컴퓨터는 가위를 선택합니다.");
	    break;
	   case 1:
	    System.out.println("컴퓨터는 바위를 선택합니다.");
	    break;
	   case 2:
	    System.out.println("컴퓨터는 보를 선택합니다.");
	    break;
	   }
	   if((man.getValue()==0)&&(com.getValue()==1))
	    System.out.println("컴퓨터가 이겼습니다.");
	   else if((man.getValue()==0)&&(com.getValue()==2))
	    System.out.println("사용자가 이겼습니다.");
	   else if((man.getValue()==1)&&(com.getValue()==0))
	    System.out.println("사용자가 이겼습니다.");
	   else if((man.getValue()==1)&&(com.getValue()==2))
	    System.out.println("컴퓨터가 이겼습니다.");
	   else if((man.getValue()==2)&&(com.getValue()==1))
	    System.out.println("사용자가 이겼습니다.");
	   else if((man.getValue()==2)&&(com.getValue()==0))
	    System.out.println("컴퓨터가 이겼습니다.");
	   else if(man.getValue()==com.getValue())
	    System.out.println("무승부 입니다.");
	  }
}
