package shoppingMall;

public class SmartTV extends Product{
	String resolution;
	
	public SmartTV( String pname, int price, String brand, String resolution){
		this.pname = pname;
		this.price = price;
		this.brand = brand; 
		this.resolution = resolution;
	}

	@Override
	public void printExtra() {
		System.out.println("해상도: " + resolution);	
		
	}
}
