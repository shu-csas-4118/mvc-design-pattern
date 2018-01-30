public class course {
	
	private String CourseName;
	private int CourseNumber;
	private int Credit;
	private professorControlor Professor;
	
	public course(String CName,int CNumber, int Cr, professorControlor P) {
		
		this.CourseName = CName;
		this.CourseNumber = CNumber;
		this.Credit = Cr;
		this.Professor = P;
	}
	
	public String getCourseName() {
		return this.CourseName;
	}
	
	public void setCourseName(String name) {
		this.CourseName = name;
	}
	
	public int getCourseNumber() {
		return this.CourseNumber;
	}
	
	public void setCourseNumber(int CNumber) {
		this.CourseNumber =  CNumber;
	}
	
	public int getCredit() {
		return this.Credit;
	}
	
	public void setCredit(int Credit) {
		this.Credit = Credit;
	}
	
	public professorControlor getProfessor() {
		return this.Professor ;
	}
	
	public void setProfessor (professorControlor P) {
		this.Professor  = P;
	}

}

