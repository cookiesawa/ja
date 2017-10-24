package shoppingMall;

public class CellPhone extends Product{ // 추상클래스 product를 상속 받아 핸드폰 클래스 생성, product 클래스의 name, price, printDetailed()메소드 재 사용
	String carrier; 
	
	public CellPhone( String pname, int price, String brand, String carrier){
		this.pname = pname; // 아버지꺼
		this.price = price; // 아버지꺼
		this.brand = brand; // 아버지꺼
		this.carrier = carrier;
	}
	@Override
	public void printExtra() { // 원래있던거 찍히고 이게 찍혀서 3개가 나옴.
		System.out.println("통신사: " + carrier);		
	}
}
