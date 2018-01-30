public class professorControlor {
	
	private professorView PV;
	private professor P;
	
	public professorControlor(professor p, professorView pv) {
		
		this.PV = pv;
		this.P = p;
	}
	
	public void printProfessorDetails() {
		this.PV.printProfessorDetails();
	}

	public String getfirstname() {
		return this.P.getfirstname();
	}
	
	public void setfirstname(String F) {
		this.P.setfirstname(F);
	}
	
	public String getlastname() {
		return this.P.getlastname();
	}
	
	public void setlastname(String L) {
		this.P.setlastname(L); 
	}
	
	public double getPhoneNumber() {
		return this.P.getPhoneNumber();
	}
	
	public void setPhoneNumber(int NewNumber) {
		this.P.setPhoneNumber(NewNumber);
	}
	public String getEmail() {
		return this.P.getEmail();
	}
	
	public void setemail(String e) {
		this.P.setemail(e);
	}
}
