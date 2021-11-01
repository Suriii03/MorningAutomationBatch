package ThisKeyword;

class A {
	void m() {
		System.out.println("Hello m");
	}
	
	void n() {
		System.out.println("Hello n");
		this.m();
	}
}
public class ThisKeyword03 {

	void method1() {
		System.out.println("Inside method one");
	}
	
	void method2() {
		this.method1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword03 obj = new ThisKeyword03();
		obj.method2();
		A a = new A();
		a.n();
	}

}
