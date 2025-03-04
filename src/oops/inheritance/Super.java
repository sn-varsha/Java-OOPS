package oops.inheritance;

class A{
   public A() {
	  super();
	  System.out.println("in A");
   }
   
   public A(int n) {
		  super();
		  System.out.println("in A int");
	   }
}

class B extends A{
	   public B() {
		  super(5);
		  System.out.println("in B");
	   }
	   
	   public B(int n) {
			  super();
			  System.out.println("in B int");
		   }
	}
public class Super {

	public static void main(String[] args) {
		B obj=new B();

	}

}
