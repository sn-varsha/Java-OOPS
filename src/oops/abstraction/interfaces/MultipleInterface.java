package oops.abstraction.interfaces;

interface M{
	int age=20;
	String arae="Mumbai";
	void show();
	void config();
}

interface X{
	void run();
}

interface Y extends X{
	
}

class N implements M,Y{
	public void show() {
		System.out.println("in show");
	}
	public void config() {
		System.out.println("in config");
	}
	public void run() {
		System.out.println("in run");
	}
}

public class MultipleInterface {

	public static void main(String[] args) {
        M obj;
        obj=new N();
        obj.show();
        obj.config();
        X obj1=new N();
        obj1.run();

	}

}
