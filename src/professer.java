public class professor {
	
	private String FName;
	private String LName;
	private double phoneNumber;
	private String email;
	
	public professor(String F, String L, double PN, String EM) {
		
		this.FName = F;
		this.LName = L;
		this.phoneNumber = PN;
		this.email = EM;
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
	
	public double getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setPhoneNumber(int NewNumber) {
		this.phoneNumber= NewNumber;
	}
	public String getEmail() {
		return this.email;
	}
	
	public void setemail(String e) {
		this.email = e;
	}

}
