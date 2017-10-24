package shoppingMall;
// abstract class
// 추상 클래스는 추상메소드와 일반 메소드로 구성됨
// 부모클래스로 템플릿 역할을 함
public abstract class Product {
	String pname;
	int price;
	// 추상 메소드
	public abstract void printExtra();	
	// 구현한 메소드
	public void printDetail(){
		System.out.print("상품명: " + pname + " , ");
		System.out.print("가격: " + price + " , ");
		printExtra();
	}
	public String getName() {
		return pname;
	}

	public void setName(String name) {
		this.pname = name;
	}

}
