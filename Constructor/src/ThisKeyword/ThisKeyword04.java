package ThisKeyword;

public class ThisKeyword04 {

	int variable = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword04 obj = new ThisKeyword04();
		obj.method(20);
		obj.method();
	}
	
	void method(int variable) {
		variable = 10;
		System.out.println("\nValue of Instance Variable is " + this.variable);
		this.variable = variable;
		System.out.println("\nValue of Instance Variable is " + this.variable);
		System.out.println("Value of Local Variable is " + variable);
	}
	
	void method() {
		int variable = 40;
		System.out.println("\nValue of Instance Variable is " + this.variable);
		System.out.println("Value of Local Variable is " + variable);
	}

}
