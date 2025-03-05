package oops.abstraction;

class A{
	int age;
	public void show() {
		System.out.println("in show");
	}
	
	static class B{
		public void config() {
			System.out.println("in config");
		}
	}
}
public class Inner {

	public static void main(String[] args) {
		A obj=new A();
		obj.show();
		
//if the inner class is not static		
//		A.B obj1=obj.new B();
//		obj1.config();
		
		A.B obj1=new A.B();
		obj1.config();

	}

}
