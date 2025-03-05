package oops.abstraction.interfaces;

interface A{
	int age=21;              //final & static
	String area="Mumbai";
	
	void show();        //by default public & abstract
	void config();
}

class B implements A{
	public void show() {
		System.out.println("in show");
	}
	public void config() {
		System.out.println("in config");
	}
	
}
public class Interface {

	public static void main(String[] args) {
		A obj;
		obj= new B();
		obj.show();
		obj.config();
		
		//A.area="Hyderabad";    can't be done bcz area is final
		System.out.println(A.area);

	}

}
