package oops.inheritance;

class C{
	public void show1() {
		System.out.println("in A show");
	}
}
class D extends C{
	public void show2() {
		System.out.println("in B show");
	}
}

public class DownCasting {
	public static void main(String[] args) {
		C obj= new D();
		obj.show1();
		D obj1=(D)obj;
		obj1.show2();
	}
}
