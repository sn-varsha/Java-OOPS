package oops.inheritance;

final class Calc1{
	public final void show() {
		System.out.println("By varsha");
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
}

//This will give us error - The type AdvCalc1 cannot subclass the final class Calc1
//class AdvCalc1 extends Calc1{
//	public void show() {
//		System.out.println("By John");
//	}
//}
class AdvCalc1 {
	public void show() {
		System.out.println("By John");
	}
}
public class Final {

	public static void main(String[] args) {
		/*final int a=8;
		a=9;*/
		AdvCalc1 obj=new AdvCalc1();
		obj.show();
		//Since final we didn't add inherit to Calc1 we cannot access add()
//		obj.add(4,5);
	}

}
