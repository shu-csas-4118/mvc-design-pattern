
public class studentController {

	private studentView SV;
	private student S;
	
	public studentController (student s, studentView sv) {
		
		this.SV = sv;
		this.S = s;
	}
	
	public void printStudentDetails() {
		this.SV.printStutentDetails();
	}
	
	public String getfirstname() {
		return this.S.getfirstname();
	}
	
	public void setfirstname(String F) {
		this.S.setfirstname(F);
	}
	
	public String getlastname() {
		return this.S.getlastname();
	}
	
	public void setlastname(String L) {
		this.S.setlastname(L); 
	}
	
	public int getIDNumber() {
		return this.S.getIDnumber();
	}
	
	public void setIDNumber(int NewNumber) {
		this.S.setIDnumber(NewNumber);
	}
	public String getEmail() {
		return this.S.getEmail();
	}
	
	public void setemail(String e) {
		this.S.setemail(e);
	}
	
	public courseControllor getCourse(int courselocation) {
		
		return this.S.getCourse(courselocation);
	}
	public void addCourse(courseControllor C) {
		
		this.S.addCourse(C);
	}
}

