package Constructor;

public class Constructor02 {
	int roll;
	double salary;
	
	Constructor02(int r, double s){
		roll = r;
		salary = s;
	}
	void display() {
		
		System.out.println("Payroll ID is: " + roll + " & Salary is: " + salary);
		
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor02 c1 = new Constructor02(101, 25000.45) ;
		c1.display();
		Constructor02 c2 = new Constructor02(201, 50000.75) ;
		c2.display();
	}

}
