import java.util.ArrayList;

public class registationControllor {
	
	ArrayList<courseControllor> StudentCourses = new ArrayList<courseControllor>(); 
	
	private studentController CourentStudent;
	
	public registationControllor(studentController S, courseControllor... courses) {
		
		 for (courseControllor C: courses) {
		        this.StudentCourses.add(C);
		 }
		 
		 this.CourentStudent = S;
		
	}
	
	public void addCourse(courseControllor C) {
		this.StudentCourses.add(C);
	}
	
	public void ViewCourses() {
		System.out.println("Course avalible for registation:");
		System.out.println("________________________________________");
		for(int i = 0; i < this.StudentCourses.size(); i++) {
			System.out.println("Course "+ (i + 1) +": ");
			this.StudentCourses.get(i).printStudentDetails();
			System.out.println("________________________________________");
		}
		
	}
	
	public void registor(courseControllor... C) {
		 for (courseControllor course: C) {
		        this.CourentStudent.addCourse(course);
		 }
	}

}
