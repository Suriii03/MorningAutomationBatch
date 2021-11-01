package ThisKeyword;

public class ThisKeyword01 {

	static int age; // global Variable
	int salary; // global variable
	int empId;

	void display(int salary) {
		System.out.println("Salary :" + salary);
		System.out.println("Salary :" + this.salary);
		this.salary = 35000;
		System.out.println("Salary: " + this.salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 25;
		System.out.println("age: " + age);
		System.out.println("global age: " + ThisKeyword01.age);
		int salary = 25000; // local variable
		int empId = 201;
		System.out.println("Local Salary: " + salary);
		System.out.println("Local EmpId: " + empId);
		ThisKeyword01 t1 = new ThisKeyword01();
		System.out.println("t1 Global EmpId: " + t1.empId);
		System.out.println("t1 Global Salary: " + t1.salary);
		t1.display(45000);
		System.out.println("t1 Global Salary: " + t1.salary);
		ThisKeyword01 t2 = new ThisKeyword01();
		System.out.println("t2 Global EmpId: " + t2.empId);
		System.out.println("t2 Global Salary: " + t2.salary);
		t2.display(45000);

	}

}
