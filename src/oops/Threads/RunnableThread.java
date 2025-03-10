package oops.Threads;

class E implements Runnable{
	public synchronized void run() {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println("hi");
				Thread.sleep(2000);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class F implements Runnable{
	public synchronized void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("hello");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class RunnableThread {

	public static void main(String[] args) throws InterruptedException{
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
		
		t1.join();
        t2.join();

	}

}
