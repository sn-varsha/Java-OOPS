package oops.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student2{
	private String name;
	private int age;
	public Student2() {
		super();
	}
	public Student2(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

public class ConstructorReference {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Navin", "Harsh", "John");
		
		List<Student2> students = new ArrayList<>();
		
//		for(String name : names) {
//			students.add(new Student2(name));
//		}
		
//		students = names.stream()
//				.map(name -> new Student2(name))
//				.toList();
		
		students = names.stream()
				.map(Student2 :: new)
				.toList();
		
		System.out.println(students);

	}

}
