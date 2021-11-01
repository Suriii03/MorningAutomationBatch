package Method_Overloading;

class MethodOverloading {
	
	MethodOverloading() {
		System.out.println("Zero-para constructor");
	}
	
	void mul(int a, int b) {
		System.out.println("Multiplication of two is: " + (a*b));
	}
	void mul(int a , int b, int c) {
		System.out.println("Multiplication of three is: " + (a*b*c));
	}
	
	
	
	public static void main(String[] args) {
		MethodOverloading m1 = new MethodOverloading();
		m1.mul(10,20);
		MethodOverloading m2 = new MethodOverloading();
		m2.mul(10,20,30);
	}

}
