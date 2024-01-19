import java.util.Scanner;
public class HideAndSeek {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		int age;
		System.out.print("How old are you?: ");	
		
		try {
			//code to monitor for errors
			 age = scan.nextInt();
			System.out.println("User's Age: " + age);
		} catch(Exception e) {
			//hander for Exception
			System.out.println("please enter an number");
			 age = scan.nextInt();

			//throw e;
		}finally {
			System.out.println();
		}
		 
		
		
		/*
		String[] peters = new String[3];
		peters[0] = "Tobey";
		peters[1] = "Andrew";
		peters[2] = "Tom";

		try {
			System.out.println(peters[1]);	
		} catch(Exception error) {
			System.out.println(peters[2]);
		}
		
		

		int [] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		
		try {
			//code to monitor for errors	
			System.out.println(nums[1]);

		}
		catch(Exception e) {
			//hander for Exception
			System.out.println("Exception has occured");
		}
		*/
		
		
		
	}
}
