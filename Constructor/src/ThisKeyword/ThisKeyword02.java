package ThisKeyword;

class student {
	int rollno ; 
	float fee ;
	
	student (int rollno , float fee) {
		this.rollno = rollno;
		this.fee = fee ;	
	}
	
	void display () {
		System.out.println(rollno + " " + fee);
	}
	
} 

class ThisKeyword02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		student s1 = new student(111 , 5000f);
		student s2 = new student(201 , 6000f);
		s1.display() ; 
		s2.display();

		
	}

}
