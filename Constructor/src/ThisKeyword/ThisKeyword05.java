package ThisKeyword;

class student1 {
	
	int rollno ;
	float fee ;
	student1(int rollno, float fee) {
		System.out.println("local rollno : " + rollno);
		System.out.println("local fee : " + fee);
		System.out.println("\nInitial Global rollno : " + this.rollno);
		System.out.println("Initial Global local fee : " + this.fee);
		
		this.rollno = rollno;
		this.fee = fee;
		System.out.println("\nafter update, Global roll no : " + this.rollno);
		System.out.println("afetr update, Global fee : " + this.fee);
	}
	
	void display() {
		System.out.println();
		System.out.println(rollno + " " + fee);
		System.out.println();
	}
}
public class ThisKeyword05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student1 m1 = new student1(111,5000f);
		m1.display();
		student1 m2 = new student1(211,6000f);
		m2.display();
	}

}
