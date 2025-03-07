package oops.abstraction.interfaces;

interface H{
	void show();
}

public class LambdaExpression {

	public static void main(String[] args) {
		H obj = () -> System.out.println("in show");
		obj.show();

	}

}
