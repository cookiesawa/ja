package shoppingMall;

public class User { // 인스턴스는 private 메소드는 public
	private  String name;
	private PayType payType; // 카드냐 캐시냐
	
	public User( String name, PayType payType){ // 매개변수 있는 생성자
		this.name = name;
		this.payType = payType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PayType getPayType() {
		return payType;
	}

	public void setPayType(PayType payType) {
		this.payType = payType;
	}
	
}
