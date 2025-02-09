package oops;

class Human3{
	private int age;
	private String name;
	public Human3() {
		age=12;
		name="John";
	}
	
	public Human3(int age, String name) {
		//super();
		this.age = age;
		this.name = name;
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

public class Default_Parameterized {
	public static void main(String[] args) {
		Human3 obj=new Human3();
		Human3 obj1=new Human3(20,"Varsha");
		System.out.println(obj.getAge()+" : "+ obj.getName());
		//obj.setAge(20);
		//obj.setName("Varsha");
		System.out.println(obj1.getAge()+" : "+ obj1.getName());
	}
}

