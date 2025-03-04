package oops;

import java.util.Objects;

class Laptop1{
	String model;
	int price;
	/*public String toString() {
		return model + ":" + price;
	}
	public boolean equals(Laptop1 that) {
			return this.model.equals(that.model)&&this.price==that.price;
		
	}*/
	
	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}
	@Override
	public String toString() {
		return "Laptop1 [model=" + model + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop1 other = (Laptop1) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	
}

public class Equals {

	public static void main(String a[]) {
		Laptop1 obj1=new Laptop1();
		obj1.model="Lenovo Yoga";
		obj1.price=1000;
		
        Laptop1 obj2=new Laptop1();
		obj2.model="Lenovo Yoga";
		obj2.price=1000;

		//boolean result=obj1==obj2;
		boolean result=obj1.equals(obj2);
		System.out.println(result);

	}

}
