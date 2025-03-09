package oops.Threads;

class E implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("hi");
		}
		try {
			Thread.sleep(10);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class F implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("hello");
		}
		try {
			Thread.sleep(10);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class RunnableThread {

	public static void main(String[] args) {
		Runnable obj1=new E();
		Runnable obj2=new F();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
//		try {
//			Thread.sleep(2);
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		t2.start();

	}

}
