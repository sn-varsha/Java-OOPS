package oops;

class A{
	public A() {
		System.out.println("Object created");
	}
	
	public void show() {
		System.out.println("in A class");
	}
}

public class AnonymousObj {

	public static void main(String[] args) {
		new A();   //anonymous object
		new A().show();

	}

}
