package oops.inheritance;

public class Inheritance {

	public static void main(String[] args) {
		VeryAdvCalc obj=new VeryAdvCalc();
		int r1=obj.add(3, 5);
		int r2=obj.sub(3, 5);
		int r3=obj.mul(3, 5);
		int r4=obj.div(3, 5);
		double r5=obj.power(3,5);
		System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
	}

}

