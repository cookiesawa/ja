package chap22.mountains;
//객체
public class Mountain implements Comparable<Mountain>{
	String name;
	int height;
	
	public Mountain(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public int getHeight() {
		return height;
	} 
	
	@Override
	public String toString() {
		return "Mountain [name=" + name + ", height=" + height + "]";
	}
	@Override
	public int compareTo(Mountain other) {
		return this.getName().compareTo(other.getName()); // 두개를 비교하는 거
	}
}
