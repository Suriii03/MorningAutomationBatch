package ThisStatement;

class A1 {
	A1() {
		this(22.56) ;
		System.out.println ("Hello Zero");
	}
	
	A1(double d) {
		
		this (15);
		System.out.println("Hello double d : " + d);
	}
	
	A1(int x) {
		
		System.out.println("Hell0 int x : " + x);
	}
}

public class ThisStatement03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A1 a1 = new A1();
		A1 a2 = new A1(15);
		A1 a3 = new A1(22.56);
		
	}

}
