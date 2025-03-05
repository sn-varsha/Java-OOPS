package oops.abstraction;

abstract class Q{
	public abstract void show();
	public abstract void config();
}
public class AbstractAnonymous {
	public static void main(String a[]) {
		Q obj=new Q() {
			public void show() {
				System.out.println("in show");
			}
			public void config() {
				System.out.println("in config");
			}
		};
		obj.show();
		obj.config();
	}

}
