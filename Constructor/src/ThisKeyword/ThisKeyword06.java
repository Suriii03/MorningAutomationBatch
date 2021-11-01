package ThisKeyword;

public class ThisKeyword06 {
	
	int a;
	int b;
	
	ThisKeyword06(int a , int b) {
		this.a = a;
		this.b = b;
	}
	
	void display() {
		
		System.out.println("a = " + a + ", b = " + b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword06 m1 = new ThisKeyword06(10,20);
		m1.display();
		System.out.println(m1.a + " , " + m1.b);
		ThisKeyword06 m2 = new ThisKeyword06(101,201);
		m2.display();
		System.out.println(m2.a + " , " + m2.b);
		
	}

}
