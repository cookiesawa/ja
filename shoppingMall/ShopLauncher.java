package shoppingMall;

public class ShopLauncher {

	public static void main(String[] args) {
		IShop shop = new MyShop(); //이름들 나오는거 
		shop.setTitle("MyShop");
		shop.genUser();
		shop.genProduct();
		shop.start();

	}

}
