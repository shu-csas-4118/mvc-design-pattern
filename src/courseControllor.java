public class courseControllor {

		private courseView CV;
		private course C;
		
		public courseControllor(course c, courseView cv) {
			
			this.CV = cv;
			this.C = c;
		}
		
		public void printStudentDetails() {
			this.CV.printCourseDetails();
		}
		
		public String getCouseName() {
			return this.C.getCourseName();
		}
		
		public void setCouseName(String name) {
			this.C.setCourseName(name);
		}
		
		public int getCouseNumber() {
			return this.C.getCourseNumber();
		}
		
		public void setCouseNumber(int CNumber) {
			this.C.setCourseNumber(CNumber);
		}
		
		public int getCredit() {
			return this.C.getCredit();
		}
		
		public void setCredit(int Credit) {
			this.C.setCredit(Credit);
		}
		
		public professorControlor getProfessor() {
			return this.C.getProfessor();
		}
		
		public void setProfessor (professorControlor P) {
			this.C.setProfessor(P);
		}

}
