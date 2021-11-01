package ThisStatement;

public class ThisKeyword04 {
	
	int a ;
	int b ;
	// Parameterized constructor
	ThisKeyword04(int a, int b) {
		
		this.a = a ;
		this.b = b ;
	}
	
	void display() {
		//displaying value of variables a & b
		System.out.println("a = " + a + " b = " + b);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword04 o1 = new ThisKeyword04 (10,20);
		o1.display();
		System.out.println(o1.a + " " + o1.b);
		ThisKeyword04 o2 = new ThisKeyword04 (101,201);
		o2.display();
		System.out.println(o2.a + " " + o2.b);
	}

}
