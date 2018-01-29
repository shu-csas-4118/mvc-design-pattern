
import java. util. ArrayList;

public class student {
	
	private String FName;
	private String LName;
	private int ID;
	private String email;
	ArrayList<courseControllor> StudentCourses = new ArrayList<courseControllor>(); 
	
	public student(String F, String L, int id, String em) {
		this.FName = F;
		this.LName = L;
		this.ID = id;
		this.email = em;
	}
	
	public String getfirstname() {
		return this.FName;
	}
	
	public void setfirstname(String F) {
		this.FName = F;
	}
	
	public String getlastname() {
		return this.LName;
	}
	
	public void setlastname(String L) {
		this.LName = L;
	}
	
	public int getIDnumber() {
		return this.ID;
	}
	
	public void setIDnumber(int id) {
		this.ID = id;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setemail(String e) {
		this.email = e;
	}
	
	public courseControllor getCourse(int courselocation) {
		
		return this.StudentCourses.get(courselocation);
	}
	
	public void addCourse(courseControllor c) {
		
		this.StudentCourses.add(c);
	}
	
}
