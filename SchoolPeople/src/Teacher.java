
public class Teacher extends Person{
	
	private String certificationSubject;

	public Teacher(String name, int birthYear, String s) {
		super(name, birthYear);
		getSubject(s);
	}

	public Teacher() {
		super();
		certificationSubject = "";
	}

	public String getSubject(String subject) {
		certificationSubject = subject;
		return certificationSubject;
	}
}
