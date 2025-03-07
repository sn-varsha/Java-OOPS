package oops.Exception;

class MyException extends Exception{
	public MyException(String string) {
		super(string);
	}
}

public class CustomException {

	public static void main(String[] args) {
		int i=20;
		int j=0;
		
		try {
			j=18/i;
			if(j==0)
				throw new MyException("I don't want to print zero");
		}
		catch(MyException e) {
			j=18/1;
			System.out.println("thats the default output " + e);
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		System.out.println(j);
		System.out.println("Bye");


	}

}
