package methodPractice;

import java.util.Scanner;
public class Example {
	
	 public static void main(String[] args) {
		 
		   Scanner scan = new Scanner(System.in);
		   System.out.print("Enter word: ");
		   String word = scan.next();
		   
		   int lastindex = word.length() - 1;
		   String firstletter = word.substring(0,1);
		   String lastletter = word.substring(lastindex, lastindex + 1);
		   String middleletter = word.substring(lastindex / 2, (lastindex / 2) + 1);
		   
		   System.out.println(firstletter);
		   System.out.println(middleletter);
		   System.out.println(lastletter);
	 }
}
