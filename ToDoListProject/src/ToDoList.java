import java.util.Scanner;

import java.util.LinkedHashMap;
import java.util.ArrayList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToDoList {

	static Account thingsToDo = new Account();
	static ArrayList<String> listOfTasks = new ArrayList<>();

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
	    String today = date.format(myFormatObj);
		
		Scanner scan = new Scanner(System.in);
		LoginInfo login = new LoginInfo(); 
		LinkedHashMap<String, String> userPassword = login.getLogin();
		
		System.out.println(userPassword);

		System.out.print("\nEnter username: ");
		String username = scan.next();
		
		if(!userPassword.containsKey(username)) {
			System.out.println("Username does not exsist!");
			System.out.print("Would you like to create an account? ");
			String newAccount = scan.next();
			
			Pattern pattern  = Pattern.compile("yes", Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(newAccount);
			
			if(matcher.find()) {
				System.out.print("username: ");
				String usernameNew = scan.next();
				
				System.out.print("password: ");
				String passwordNew = scan.next();
				
				while(passwordNew.length() < 6) {
					System.out.println("password too short!");
					System.out.print("password: ");
					passwordNew = scan.next();
				}
				
				login.setLogin(usernameNew, passwordNew);
			}
		}
			
		if(userPassword.size() <= 4 && userPassword.containsKey(username)) {
			System.out.print("Enter password: ");
			String password = scan.next();
			while(!userPassword.containsValue(password)) {
				System.out.println("Incorrect password! \nEnter again");
				password = scan.next();
			}
			
		}		
		
		//login.getLogin();
		System.out.println();
		System.out.println("Welcome " + username);
		System.out.println("Today is: "+ today);
		System.out.println("Add atleast 3 task you need to complete today");
		String tasks = scan.nextLine();
		do{
			tasks = scan.nextLine();
			addTasks(tasks);
		}while((!tasks.equalsIgnoreCase("done")));
		
		listOfTasks.remove("done");
		tasksOfTheDay();
		
		System.out.print("Did you finish a task(enter done when finished removing tasks)?");
		String taskDone = scan.next();
		while(taskDone.equalsIgnoreCase("yes")) {
			tasks = scan.nextLine();
			if(tasks.equalsIgnoreCase("done")) {
				taskDone = "no";
			}
			removTasks(tasks);
		}
		
		System.out.print("Are you done for today? ");
		taskDone = scan.next();
		if(taskDone.equalsIgnoreCase("yes")) {
			System.out.println("Great job today!");
			System.out.println("You had " + listOfTasks.size() + " tasks left");
		}
		
	}
		
	public static void addTasks(String task) {
		thingsToDo.setTask(task);
	}
	
	public static void tasksOfTheDay() {
		listOfTasks = thingsToDo.getTask();
		
		System.out.println();
		for(String x : listOfTasks) {
			System.out.println(" --> " + x);
		}
	}
	
	public static void removTasks(String task) {
		listOfTasks.remove(task);
	}
	
	
}
