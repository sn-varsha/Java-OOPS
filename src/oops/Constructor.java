package oops;

class Human2{
	private int age;
	private String name;
	public Human2() {
		age=12;
		name="John";
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Constructor {

	public static void main(String[] args) {
		Human2 obj=new Human2();
		System.out.println(obj.getAge()+" : "+ obj.getName());
		obj.setAge(20);
		obj.setName("Varsha");
		System.out.println(obj.getAge()+" : "+ obj.getName());
	}

}


