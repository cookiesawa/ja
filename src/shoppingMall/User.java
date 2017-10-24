package shoppingMall;

public class User {
	private  String name; // 변수: 사람 이름
	private PayType payType; // 카드 or 현금 선택
	// 매개 변수 있는 생성자
	public User( String name, PayType payType){
		this.name = name;
		this.payType = payType;
	}
	// 이름 set, get 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// 
	public PayType getPayType() {
		return payType;
	}

	public void setPayType(PayType payType) {
		this.payType = payType;
	}
	
}
