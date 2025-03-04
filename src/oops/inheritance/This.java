package oops.inheritance;

class P{
	   public P() {
		  super();
		  System.out.println("in P");
	   }
	   
	   public P(int n) {
			 this();
			  System.out.println("in P int");
		   }
	}

	class Q extends P{
		   public Q() {
			  super(5);
			  System.out.println("in Q");
		   }
		   
		   public Q(int n) {
				  this();
				  System.out.println("in Q int");
			   }
		}
	public class This {

		public static void main(String[] args) {
			Q obj=new Q(5);

		}

	}