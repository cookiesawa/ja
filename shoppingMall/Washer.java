package shoppingMall;

public class Washer extends Product{
	double weight;
	
	public Washer(String pname, int price, String brand, double weight){
		this.pname = pname;
		this.price = price;
		this.brand = brand;
		this.weight = weight;
	}

	@Override
	public void printExtra() {
		System.out.println("무게: " + weight + "kg");	
		
	}
}
