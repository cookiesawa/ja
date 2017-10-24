package shoppingMall;
//extends Product
//상속 클래스
//Product 클래스를 상속 받아 WashingMachine 클래스를 생성
public class WashingMachine extends Product{
	String brand; // 브랜드 : 새로 추가한 변수 (상속 x)
	String noise; // 소음 여부 : 새로 추가한 변수 (상속 x)
	String capacity; // 용량 : 새로 추가한 변수 (상속x)
	
	public WashingMachine( String pname, int price, String brand, String noise, String capacity){
		this.pname = pname; // 상속 받은 변수
		this.price = price; // 상속 받은 변수
		this.brand = brand;
		this.noise = noise;
		this.capacity = capacity;
		
	}
	@Override
	public void printExtra() {
		System.out.print("브랜드: " + brand);
		System.out.print("소음 여부: " + noise);
		System.out.print("용량: " + capacity);
	}
}
