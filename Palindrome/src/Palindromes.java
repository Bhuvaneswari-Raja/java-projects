import java.util.Scanner;
public class Palindromes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word;
		
		System.out.print("Enter a word: ");
		word = scan.nextLine();
	
		String pal = "";
		for(int i = word.length() - 1; i >= 0; i--) {
			pal = pal + word.charAt(i);
		}
		/*
		System.out.println("w: " + word);
		System.out.println("p: " + pal);
		
		
		if(word == pal) {
			System.out.println("word == pal");
		}*/
		
		if(pal.equals(word)) {
			System.out.println(word + " is a palindrome");
		}
		else {
			System.out.println( word + " is not a palindrome");
		}

	}

}
