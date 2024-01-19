package storyTemplate;

import java.util.Scanner;
public class TestRun {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number between 1 and 3: ");
		int x = scan.nextInt();
		
		if(x == 1) {			
			HarryPotter story = new HarryPotter();
			story.storyName();
			story.creator();
			story.protagonist();
			story.antagonist();
			story.setting();
			story.next();
			
		}else if(x == 2) {
			PercyJackson story = new PercyJackson();
			story.storyName();
			story.creator();
			story.protagonist();
			story.antagonist();
			story.setting();
			story.next();
			
		}else if(x == 3) {			
			FaultInOurStars story = new FaultInOurStars();
			story.storyName();
			story.creator();
			story.protagonist();
			story.antagonist();
			
		}else {
			System.out.println("ERROR");
		}
		
		
	}

}
