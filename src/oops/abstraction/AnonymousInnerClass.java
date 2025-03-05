package oops.abstraction;

class P{
	public void show() {
		System.out.println("in P show");
	}
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		P obj=new P()
		{
			public void show() {
				System.out.println("in new show");
			}
		};
		obj.show();

	}

}
