package oops.inheritance;

class Cal{
	public int add(int n1,int n2) {
		return n1+n2;
	}
}

class AdvCal extends Cal{
	public int add(int n1,int n2) {
		return n1+n2+1;
	}
}

public class Overriding {

	public static void main(String[] args) {
		AdvCal obj=new AdvCal();
		int r1=obj.add(3, 4);
		System.out.println(r1);
	}

}
