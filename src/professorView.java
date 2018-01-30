public class professorView {

	private professor P;
	
	public professorView(professor p) {
		this.P = p;
	}
	
	public void printProfessorDetails(professor p) {
		this.P = p;
		printProfessorDetails();
	}
	public void printProfessorDetails() {
		
		System.out.println("Professor's first name: "+ this.P.getfirstname());
		System.out.println("Professor's last name: "+ this.P.getlastname());
		System.out.println("Professor's Phone number: "+ this.P.getPhoneNumber());
		System.out.println("Professor's email: "+ this.P.getEmail());
	}
}
