package student;

public class PracticeTwo {
	
	private String firstName;
	private String lastName;
	private int age;
	private int gradeLevel;

	
	PracticeTwo() {
		firstName = "";
		lastName = "";
		age = 0;
		gradeLevel = 0;
	}
	
	
	
	PracticeTwo(String name1, String name2, int age, int gradeLevel) {
			getName(name1, name2);
			getAge(age);
			getGradeLevel(gradeLevel);
			

	}
	
	 public void getName(String firstName, String lastName) {
		 System.out.println();
		 System.out.println("<3-------------------------------------------<3");
		 System.out.println(" Name:  " + firstName + " " + lastName);	 
	 }
	 
	 public void getAge(int age) {
		System.out.println(" Age: " + age);	 
	 }

	  public void getGradeLevel(int gradeLevel){
	   	if(gradeLevel == 9) {
			System.out.println(" Grade Level:  " + "Freshman");	
			System.out.println("<3-------------------------------------------<3");
	   	}else if(gradeLevel == 10) {
			System.out.println(" Grade Level:  "+ "Sophomore");	 
			System.out.println("<3-------------------------------------------<3");

	   	}else if(gradeLevel == 11) {
			System.out.println(" Grade Level:  " + "Junior");	 
			System.out.println("<3-------------------------------------------<3");

	   	}else if(gradeLevel == 12) {
			System.out.println(" Grade Level:  " + "Senior");	
			System.out.println("<3-------------------------------------------<3");

	   	}else if(gradeLevel < 9 && gradeLevel > 5) {
			System.out.println(" Grade Level:  " + "Middle School Student");
			System.out.println("<3-------------------------------------------<3");

	   	}else if(gradeLevel < 9 && gradeLevel < 6) {
			System.out.println(" Grade Level:  " + "Elememntry School Student");
			System.out.println("<3-------------------------------------------<3");

	   	}else {
			System.out.println(" Grade Level:  " + "College Student");
			System.out.println("<3-------------------------------------------<3");

	   	}
	  }	
}
