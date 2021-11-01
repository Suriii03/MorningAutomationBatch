package ThisKeyword;

public class ThisKeyword07 {

	int variable = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword07 m1 = new ThisKeyword07 () ;
		m1.method(20) ;
		m1.method();
	}
	void method (int variable) {
		
		variable = 10;
		System.out.println("Value of Instance Variable is : " + this.variable);
		System.out.println("Value of Local Variable is : " + variable);
		System.out.println();
	}
	
	void method() {
		int variable = 40;
		System.out.println("Value of Instance Variable is : " + this.variable);
		System.out.println("Value of Local Variable is : " + variable);
	}
}
