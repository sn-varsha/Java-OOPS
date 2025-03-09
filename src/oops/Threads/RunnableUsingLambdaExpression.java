package oops.Threads;

//public class RunnableUsingLambdaExpression {
//
//	public static void main(String[] args) {
//		Runnable obj1= ()->
//		{
//			for(int i=1;i<=10;i++) {
//				System.out.println("hi");
//			}
//			try {
//				Thread.sleep(10);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		};
//		
//		Runnable obj2= ()->
//		{
//			for(int i=1;i<=10;i++) {
//				System.out.println("hello");
//			}
//			try {
//				Thread.sleep(10);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		};
//		
//		Thread t1=new Thread(obj1);
//		Thread t2 = new Thread(obj2);
//		
//		t1.start();
//		t2.start();
//		
//
//	}
//
//}

class Task {
    private boolean isHiTurn = true; // Control flag

    public synchronized void printHi() {
        for (int i = 0; i < 10; i++) {
            while (!isHiTurn) { // If it's not "hi" thread's turn, wait
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("hi");
            isHiTurn = false; // Switch turn to "hello"
            notify(); // Wake up waiting "hello" thread
        }
    }

    public synchronized void printHello() {
        for (int i = 0; i < 10; i++) {
            while (isHiTurn) { // If it's not "hello" thread's turn, wait
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("hello");
            isHiTurn = true; // Switch turn to "hi"
            notify(); // Wake up waiting "hi" thread
        }
    }
}

public class RunnableUsingLambdaExpression {
    public static void main(String[] args) {
        Task task = new Task();

        Runnable obj1 = () -> task.printHi();
        Runnable obj2 = () -> task.printHello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}

