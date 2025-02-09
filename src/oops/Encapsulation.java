package oops;

class Human{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		age = a;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.setAge(20);
		obj.setName("Varsha");
		System.out.println(obj.getAge()+" : "+ obj.getName());
	}

}
