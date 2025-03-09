package oops.Exception;

//class T{
//	public void show() {
//		try {
//			Class.forName("Calc");
//		}
//		catch(ClassNotFoundException e){
//			System.out.println("not able to find that class " + e);
//		}
//	}
//}
//
//public class ExceptionUsingThrows {
//    static {
//    	
//    System.out.println("class loaded");
//    }
//	public static void main(String[] args) {
//		T obj = new T();
//		obj.show();
//
//	}
//
//}

class T{
	public void show() throws ClassNotFoundException{
		Class.forName("Calc");
	}
}

public class ExceptionUsingThrows {
    static {
    	System.out.println("class loaded");
    }
	public static void main(String[] args) {
		T obj = new T();
		try {
			obj.show();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}