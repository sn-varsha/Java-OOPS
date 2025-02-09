package oops;

class Human1{
	private int age;
	private String name;
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

public class EncapsulationThis {

	public static void main(String[] args) {
		Human1 obj=new Human1();
		obj.setAge(20);
		obj.setName("Varsha");
		System.out.println(obj.getAge()+" : "+ obj.getName());
	}

}

