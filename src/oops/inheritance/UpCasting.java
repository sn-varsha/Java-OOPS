package oops.inheritance;

class X{
	public void show1() {
		System.out.println("in A show");
	}
}
class Y extends X{
	public void show2() {
		System.out.println("in B show");
	}
}

public class UpCasting {

	public static void main(String[] args) {
		X obj= (X)new Y();
		obj.show1();
	}

}
