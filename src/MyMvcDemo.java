

public class MVC {

	public static void main(String[] args) {
		
		student s = new student("Bill","Bradly", 128436, "thsi is a email");
		studentView sv = new studentView(s);
		studentController sc = new studentController(s, sv);
		
		professor p = new professor("Tom","Thompson", 2345675, "thsi is a email");
		professorView pv = new professorView(p);
		professorControlor pc = new professorControlor(p, pv);
		
		professor p2 = new professor("phill","Phillips", 5037564, "thsi is a email");
		professorView pv2 = new professorView(p2);
		professorControlor pc2 = new professorControlor(p2, pv2);
		
		course c = new course("Spec Topics-Comp Science",4086, 3, pc);
		courseView cv = new courseView(c);
		courseControllor cc = new courseControllor(c, cv);
		
		course c2 = new course("Formal Lang and Automata",4113, 3, pc);
		courseView cv2 = new courseView(c2);
		courseControllor cc2 = new courseControllor(c2, cv2);
		
		course c3 = new course("Data Mining",3010, 3, pc2);
		courseView cv3 = new courseView(c3);
		courseControllor cc3 = new courseControllor(c3, cv3);
		
		course c4 = new course("General Physics I",1701, 3, pc2);
		courseView cv4 = new courseView(c4);
		courseControllor cc4 = new courseControllor(c4, cv4);
		
		registationControllor RC = new registationControllor(sc, cc, cc2, cc3, cc4);
		
		sc.printStudentDetails();
		sc.setlastname("Weeeks");
		sc.setfirstname("Alex");
		sc.setIDNumber(828328);
		sc.setemail("alexander.weeks@student.shu.edu");
		System.out.println("________________________________________");
		sc.printStudentDetails();
		
		RC.ViewCourses();
		RC.registor(cc,cc3,cc4);
		sc.printStudentDetails();
		
		

	}

}

