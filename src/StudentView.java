
public class studentView {
	private student S;
	
	public studentView(student s) {
		this.S = s;
	}
	
	public void printStudentDetails(student s) {
		this.S = s;
		printStutentDetails();
	}
	
	public void printStutentDetails() {
		if (this.S == null) throw new IllegalArgumentException("student"); 
			
		System.out.println("Student's first name: "+ this.S.getfirstname());
		System.out.println("Student's last name: "+ this.S.getlastname());
		System.out.println("Student's ID number: "+ this.S.getIDnumber());
		System.out.println("Student's email: "+ this.S.getEmail());
		System.out.println("Student's courses are:");
		if(this.S.StudentCourses.size() == 0) {
			System.out.println("Student is not registered to any Courses");
			System.out.println("________________________________________");
		}
		else {
			System.out.println("________________________________________");
			for(int i = 0; i < this.S.StudentCourses.size(); i++) {
				System.out.println("Course "+ (i + 1) +": ");
				this.S.getCourse(i).printStudentDetails();
				System.out.println("________________________________________");
			}
		}
	}

}
