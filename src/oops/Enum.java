package oops;

enum Status{
	Running, Failed, Pending, Success;
}

public class Enum {

	public static void main(String[] args) {
		int i=5;
//		Status s=Status.Failed;
//		System.out.println(s);
//		System.out.println(s.ordinal());
		
		Status[] ss=Status.values();
		for(Status s:ss) {
			System.out.println(s+":"+ s.ordinal());
		}

	}

}
