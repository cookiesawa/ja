package shoppingMall;

import java.util.ArrayList;
import java.util.Scanner;
// 인터페이스 IShop의 기능을 MyShop 클래스에서 반드시 구현해야함
public class MyShop implements IShop{
	
	private static final String True = null;
	String title;
	int selUser;
	int psel;
	
	ArrayList<User> users = new ArrayList<User>();
	ArrayList<Product> products = new ArrayList<Product>();
	ArrayList<Product> cart = new ArrayList<Product>();
	// 키보드 입력 가능
	Scanner scan = new Scanner( System.in);

	@Override // 메소드 재정의
	public void setTitle(String title) {
		this.title = title;	
	}

	@Override // 유저 추가하기
	public void genUser() {
		User one = new User("김성진", PayType.CARD);
		User two = new User("김영진", PayType.CASH);
		User three = new User("장아영", PayType.CASH);
		User four = new User("김효진", PayType.CARD);
		User five = new User("김주희", PayType.CASH);
		User six = new User("김지윤", PayType.CARD);
		users.add(one);
		users.add(two);
		users.add(three);
		users.add(four);
		users.add(five);
		users.add(six);
		
	}

	@Override // product 세탁기 추가하기
	public void genProduct() {
		CellPhone cp = new CellPhone("갤럭시노트5", 1000000, "SKT" );
		products.add(cp);
		cp = new CellPhone("애플 아이폰7", 980000, "KT" );
		products.add(cp);
	    SmartTV st = new SmartTV("삼성 3D 스마트티브", 500000, "4K");
	    products.add(st);
	    st = new SmartTV("LG 스마트티브", 450000, "Full HD");
	    products.add(st);
	    
	    WashingMachine wm = new WashingMachine("트롬", 800000,"LG전자","소음 적음",  "15kg");
	    products.add(wm);
	    wm = new WashingMachine("버블샷", 1000000, "삼성", "소음 없음", "15kg");
	    products.add(wm);
	}
	
	@Override
	public void start() {
		System.out.println(title +  "  :  메인 화면 - 계정 선택");
		System.out.println("=====================");
		int i = 0;
		for( User u : users){
			System.out.printf("[%d]%s(%s)\n", i++, u.getName(), u.getPayType());
		}
		System.out.println("[x]종료");
		System.out.print("선택  : ");
        String sel = scan.next();
        int selInt = Integer.parseInt(sel);
        System.out.println("## " + users.get(selInt).getName() + "님 환영합니다. ##");
        switch(sel){
			case "x" : System.exit(0); break;
			default: 
						selUser = Integer.parseInt(sel);
						productList();
        }
		
	}
	
	private void productList() {
		System.out.println(title +  "  :  상품목록 - 상품 선택");
		System.out.println("=====================");
		int i = 0;
		for( Product p : products){
			System.out.print("[" + i + "]");
			p.printDetail();
			i++;
		}
		System.out.println("[h]메인화면");
		System.out.println("[c]체크아웃");
		System.out.print("선택  : ");
        String sel = scan.next();
        
        switch(sel){
				case "h" : start(); break;
				case "c" : checkOut(); break;
				default: 
						int psel = Integer.parseInt(sel);
						cart.add(products.get(psel));
						productList();
        }
        int productsInt = Integer.parseInt(sel); 
        System.out.println("## " + products.get(productsInt).getName() + "을 장바구니에 담았습니다. ##");
	}

	private void checkOut() {
		System.out.println(title +  "  :  체크 아웃");
		System.out.println("=====================");
		int total = 0;
		int i = 0;
		for( Product p : cart){
			System.out.printf("[%d]%s(%s)\n", i++, p.pname, p.price);
			total = total + p.price;
		}
		System.out.println("=====================");
		System.out.println("결제 방법: " + users.get(selUser).getPayType());
		
		System.out.println("합계 " + total + " 원 입니다.");
		System.out.println("[p]이전, [q]결제 완료");
		System.out.print("선택  : ");
        String sel = scan.next();
        System.out.println("## " + sel + "선택 ##");
        switch(sel){
			case "q" : 
				System.out.println("## 결제가 완료 되었습니다. 종료합니다 ##");
				System.exit(0); 
				break;
			case "p" : productList(); 
							break;
			default: 
							checkOut();
        	
        }
	}

}
