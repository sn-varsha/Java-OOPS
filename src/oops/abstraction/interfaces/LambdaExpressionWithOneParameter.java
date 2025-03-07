package oops.abstraction.interfaces;

interface J{
	void show(int i);
}

//public class LambdaExpressionWithOneParameter {
//
//	public static void main(String[] args) {
//		P obj = new P()
//		{
//			public void show(int i) {
//				System.out.println("in show " + i);
//			}
//		};
//		obj.show(3);
//
//	}
//
//}

public class LambdaExpressionWithOneParameter {

	public static void main(String[] args) {
		J obj = i -> System.out.println("in show " +i);
		obj.show(3);

	}

}
