package homework_chap21;
// PROGAMMING 1

public class Test{
    public static void main(String[] args){
         
	    try{
	    	sub();
	    }catch(ArrayIndexOutOfBoundsException e){
	    	System.out.println("배열의 범위를 초과할 수 없습니다.");
	    }
    }
       
    public static void sub() throws ArrayIndexOutOfBoundsException{
        int[] array = new int[10];
        int i = array[10];
    }
}

