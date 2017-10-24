package homework_chap21;
// PROGRAMMING 3
class NotFoundExeception extends Exception {
	public NotFoundExeception(String message){
		super(message);
	}
}

public class Number{
	public static void searchArray(int[] array, int number)
		throws NotFoundExeception {
		int i = 0;
		boolean match = false;
		
		for (i = 0; i< array.length; i++ ) {
			if (number == array[i]) {
				System.out.println("찾는 값이 있습니다." + array[i]);
				match = true;
			}
		}
		if (!match) {
			throw (new NotFoundExeception("찾는 값이 없습니다."));
		}
	}

	public static void main(String[] args) {
		int[] array = {55, 6, 5, 4, 8, 51, 71, 41, 98};
		
		try {
			searchArray(array, 12);
			searchArray(array, 18);
		} catch (NotFoundExeception e) {
			e.printStackTrace();
		}
	}
}
