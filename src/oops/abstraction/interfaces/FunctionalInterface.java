package oops.abstraction.interfaces;

//@FunctionalInterface
interface P{
	void show();
}

//class Q implements P{
//	public void show() {
//		System.out.println("in show");
//	}
//}

public class FunctionalInterface {

	public static void main(String[] args) {
		P obj = new P()
		{
			public void show() {
				System.out.println("in show");
			}
		};
		obj.show();

	}

}
