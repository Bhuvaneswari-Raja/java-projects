import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Person homoSapien = new Person("Steve", 1980);
		Scanner scan = new Scanner(System.in);

		String name;
		int bYear;
		String who;

		System.out.print("Enter name: ");
		name = scan.next();
		System.out.print("Enter birth year: ");
		bYear = scan.nextInt();
		System.out.print("Student or Teacher? ");
		who = scan.next();

		if (who.equalsIgnoreCase("student")) {
			double gpa;
			System.out.print("Enter GPA: ");
			gpa = scan.nextDouble();
			Student student1 = new Student(name, bYear, gpa);
		}
		if (who.equalsIgnoreCase("teacher")) {
			String subject;
			System.out.print("Enter certification subject: ");
			subject = scan.next();
			Teacher teacher1 = new Teacher(name, bYear, subject);

		}

	}
}
