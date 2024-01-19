import java.util.Scanner;
import java.util.HashMap;

public class UMBCGrades {
	
	private static double GradePointAverage;
	private static double rawScore;

		
	public static void main(String args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many classes do you take? ");
		int numOfClasses = scan.nextInt();
		
		for(int i = 1; i <= numOfClasses; i++) {
			System.out.print("Enter your letter grade: ");
			String letterGrade = scan.next();
			letterGradeConversion(letterGrade);
		}
		
		System.out.println("Cummulative GPA: " + GradePointAverage);

	}
	
	public static void letterGradeConversion(String grade) {
		HashMap<String, Double> GPAScale = new HashMap<>();
		GPAScale.put("A+", 4.0);
		GPAScale.put("A", 4.0);
		GPAScale.put("A-", 3.7);
		GPAScale.put("B+", 3.3);
		GPAScale.put("B", 3.0);
		GPAScale.put("B-", 2.7);
		GPAScale.put("C+", 2.3);
		GPAScale.put("C", 2.0);
		GPAScale.put("C-", 1.7);
		GPAScale.put("D+", 1.3);
		GPAScale.put("D", 1.0);
		GPAScale.put("F", 0.0);
		
		rawScore= rawScore + GPAScale.get(grade);
	}
	
	public static double getFinalGPA(int classesNum) {
		
		GradePointAverage = rawScore / classesNum;
		
		return GradePointAverage;
		
	}
	
}
