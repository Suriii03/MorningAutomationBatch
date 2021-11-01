package FinalKeyword;

public class FinalKeyword01 {
	
	final int empId = 101;
	double salary = 34600.68;
	
	void run() {
		System.out.println("empId = " + empId);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalKeyword01 obj = new FinalKeyword01() ;
		obj.run();
		System.out.println(obj.salary);
	}

}
