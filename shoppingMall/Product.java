package shoppingMall;

public abstract class Product { //부모클래스로 템플릿 역할을 함, 추상클래스는 추상메소드와 일반 메소드로 구성됌
	String pname; 
	int price;
	String brand;
	
	public abstract void printExtra(); // 추상메소드
	public void printDetail(){ // 구현한 메소드
		System.out.println("상품명: " + pname + " , ");
		System.out.println("가격: " + price + " , ");
		System.out.println("브랜드: " + brand + " , ");
		printExtra();
	}
	
	public String getName() {
		return pname;
	}

	public void setName(String name) {
		this.pname = name;
	}
}
