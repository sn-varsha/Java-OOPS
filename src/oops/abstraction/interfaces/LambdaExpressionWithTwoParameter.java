package oops.abstraction.interfaces;

interface K{
	void show(int i,int j);
}

//public class LambdaExpressionWithTwoParameter {
//
//	public static void main(String[] args) {
//		P obj = new P()
//		{
//			public void show(int i,int j) {
//				System.out.println("in show " + i +","+ j);
//			}
//		};
//		obj.show(3,4);
//
//	}
//
//}

public class LambdaExpressionWithTwoParameter {

	public static void main(String[] args) {
		K obj = (i,j) -> System.out.println("in show " +i +"," +j);
		obj.show(3,4);

	}

}

