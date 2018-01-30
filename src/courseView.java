public class courseView {
	
	private course C;
	
	public courseView(course c) {
		this.C = c;
	}
	
	public void printCourseDetails(course c) {
		this.C = c;
		printCourseDetails();
	}
	
	public void printCourseDetails() {
		
		System.out.println("Course's name: "+ this.C.getCourseName());
		System.out.println("Course's number: "+ this.C.getCourseNumber());
		System.out.println("Course's credits: "+ this.C.getCredit());
		System.out.println("Course's Professor: ");
		this.C.getProfessor().printProfessorDetails();
	}

}
