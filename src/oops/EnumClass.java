package oops;

enum Laptop2{
	Macbook(2000),XPS(2200),Surface,ThinkPad(1800);
	
	private int price;

	private Laptop2() {
		price=500;
		//System.out.println("in Laptop "+ this.name());
	}

	private Laptop2(int price) {
		this.price = price;
		System.out.println("in Laptop "+ this.name());
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
public class EnumClass {

	public static void main(String[] args) {
//		Laptop2 lap=Laptop2.Macbook;
//		System.out.println(lap+":"+lap.getPrice());
		
		for(Laptop2 lap:Laptop2.values())
			System.out.println(lap+":"+lap.getPrice());

	}

}
