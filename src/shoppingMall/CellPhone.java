package shoppingMall;
// extends Product
// 상속 클래스
// Product 클래스를 상속 받아 Cellphone 클래스를 생성
public class CellPhone extends Product{
	String carrier; // 통신사 : 새로 추가한 변수 (상속 x)
	
	public CellPhone( String pname, int price, String carrier){
		this.pname = pname; // 이름 : 상속 받은 변수
		this.price = price; // 가격 : 상속 받은 변수
		this.carrier = carrier;
	}
	@Override
	public void printExtra() {
		System.out.println("통신사: " + carrier);		
	}
}
