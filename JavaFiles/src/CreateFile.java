// April 11, 2023
import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) {
		
		try {
			File myFile = new File("story.txt");
			if(myFile.createNewFile()) {
				System.out.println("File created: " + myFile.getName());
			} else {
				System.out.println("File alreday exists");
				System.out.println(myFile.getAbsolutePath());
			}
		}
		catch (IOException e) {
			System.out.println("An error occured ");
			e.printStackTrace();
		}
		
	}

}
