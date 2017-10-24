package homework_chap20;
// EXERCISE 5
import java.util.Calendar;
import java.util.StringTokenizer;

public class Test {
	 public static void main(String[] args) {
		  int num;
		  num=(int)(Math.random()*100);
		  System.out.printf("1번 문제 : %d\n",num);
		  String str = new String("082-2-777-5566");
		  int cnt,i;
		  StringTokenizer token = new StringTokenizer(str,"-");
		  cnt=token.countTokens();
		  System.out.print("2번 문제 : ");
		  for(i=0;i<cnt;i++){
		   System.out.print(token.nextToken()+" ");
		  }
		  
		  Calendar cal = Calendar.getInstance();
		  System.out.printf("\n3번 문제 : %d.%d.%d\n"
		                ,cal.get(Calendar.YEAR),cal.get(Calendar.MONTH)+1,cal.get(Calendar.DATE));
		  Test test = new Test();
		  System.out.print("4번 문제 : "+Test.class.getName());
		  System.out.println();
		  System.out.println("5번 문제 : ");
		  for(i=0;i<=90;i+=5){
		   System.out.printf("sin %d도 : %.2f\n",i,Math.sin(Math.toRadians(i)));
		  }
	 }
}



