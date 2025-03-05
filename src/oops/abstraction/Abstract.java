package oops.abstraction;

abstract class Car{
	public abstract void drive();
	public abstract void fly();
	public void playMusic() {
		System.out.println("Play Music..");
	}
}

abstract class WagonR extends Car{
	public void drive(){
		System.out.println("Driving..");
	}
}

class UpdatedWagonR extends WagonR{
	public void fly() {
		System.out.println("Flying..");
	}
}

public class Abstract{
	public static void main(String a[]) {
		Car obj=new UpdatedWagonR();
		obj.drive();
		obj.fly();
		obj.playMusic();
	}
}