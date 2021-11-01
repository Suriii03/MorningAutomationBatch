package Constructor;

class A {
	int i = 10;
	A() {
		System.out.println("Running a class A Constructor");
	}
	void display() {
		System.out.println("I am display() of Class A");
		}
	}
	
class X {
	int j=10;
	X() {
		System.out.println("Running a class X Constructor");
	}
	void display() {
		System.out.println("I am display() of Class X");
	}
}
public class Cons03 {
	void display() {
		System.out.println("I am display() of class Cons03");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main() of Class Cons5 is started...");
		A a1 = new A();
		a1.display();
		System.out.println("Class A global variable is " + a1.i);
		X a2 = new X();
		a2.display();
		System.out.println("Class X global variable is " + a2.j);
		Cons03 a3 = new Cons03();
		a3.display();
		System.out.println("Main() of Cons03 are ends here ");
		
	}

}
