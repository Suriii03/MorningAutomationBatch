package Constructor;

public class Constructor01 {
	
	public Constructor01(){
		System.out.println("This is zero-paramaterized constructor");
	}
	
	public Constructor01(char c) {
		System.out.println("This is Single-paramaterized constructor");
	}
	
	public Constructor01(int num1, int num2) {
		System.out.println("This is int-int paramaterized constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor01 c1 = new Constructor01();
		Constructor01 c2 = new Constructor01('a');
		Constructor01 c3 = new Constructor01(5,10);
	}

}
