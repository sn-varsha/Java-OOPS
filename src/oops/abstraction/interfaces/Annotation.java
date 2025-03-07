package oops.abstraction.interfaces;

class F{
	public void show() {
		System.out.println("in A show");
	}
}

class G extends F{
	@Override
	public void show() {
		System.out.println("in B show");
	}
}
public class Annotation {

	public static void main(String[] args) {
		G obj= new G();
		obj.show();

	}

}
