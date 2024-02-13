import java.util.*;

public class Attendence {
	
	public static void main(String[] args) {

		Student student1 = new Student("Pooja", "12", 4.5);

		System.out.println(student1.studentName());
		System.out.println(student1.studentGrade());
		System.out.println(student1.studentGPA());

		System.out.println("===============================");

		Student student2 = new Student("Kala", "10", 4.5);
		
		System.out.println(student2.studentName());
		System.out.println(student2.studentGrade());
		System.out.println(student2.studentGPA());	
		

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);

		System.out.println(studentList);

		/*for (int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i).studentName());
		}*/

		for(Student student : studentList) {
			System.out.println(studentList);
		}


	}

}