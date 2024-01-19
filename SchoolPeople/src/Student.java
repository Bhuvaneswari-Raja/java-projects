
public class Student extends Person {

	private double gpa;

	public Student(String name, int birthYear, double gpa) {
		super(name, birthYear);
		getGPA(gpa);
	}

	public Student() {
		super();
		gpa = 0.00;
	}

	public double getGPA(double g) {
		gpa = g;
		return gpa;
	}

	public String toString() {
		return "Name: " + getName() + "\nAge: " + getBirthYear(birthYear) + "\nStudent's GPA: " + gpa; 
	}

}
