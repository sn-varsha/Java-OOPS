package oops.abstraction.interfaces;

interface L{
	int show(int i,int j);
}

//public class LambdaExpressionWithReturn {
//
//	public static void main(String[] args) {
//		P obj = new P()
//		{
//			public int show(int i,int j) {
//				return i+j;
//			}
//		};
//		int result=obj.show(3,4);
//      System.out.println(result);
//
//	}
//
//}
public class LambdaExpressionWithReturn {

	public static void main(String[] args) {
		L obj = (i,j) -> i+j;
		int result = obj.show(3,4);
		System.out.println(result);
	}

}
