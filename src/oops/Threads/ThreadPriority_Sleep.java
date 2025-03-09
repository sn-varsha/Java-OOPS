package oops.Threads;

class C extends Thread{
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("hi");
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class D extends Thread{
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("hello");
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadPriority_Sleep {

	public static void main(String[] args) {
		C obj1=new C();
		D obj2 = new D();
		
		obj1.start();
		obj2.start();
		
		System.out.println(obj1.getPriority());
		obj2.setPriority(6);
		obj2.setPriority(Thread.MAX_PRIORITY);
		obj1.setPriority(Thread.MAX_PRIORITY-1);
	}

}
