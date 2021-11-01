package ThisStatement;

class student01 {
	
	int rollno;
	float fee;
	student01(int rollno) {
		
		this.rollno=rollno;
		
	}

	student01(int rollno, float fee) {
		
		this(rollno);
		this.fee = fee;
		
	}
	
	void display() {
		
		System.out.println(rollno + " " + fee);
	}
	
}
public class ThisStatement01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student01 s1 = new student01(111);
		student01 s2 = new student01(112, 6000f);
		s1.display();
		s2.display();
		
	}

}
