package oops;

class Laptop{
	String model;
	int price;
	/*public String toSting() {
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}*/
	public String toString() {
		return model + ":" + price;
	}
}
public class ToString {

	public static void main(String[] args) {
		Laptop obj=new Laptop();
		obj.model="Lenovo Yoga";
		obj.price=1000;
		//System.out.println(obj.toString());
        System.out.println(obj);
	}

}
