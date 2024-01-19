import java.util.ArrayList;

public class Account {
	
	ArrayList<String> listOfTasks = new ArrayList<>();
	
	public void setTask(String task) {
		listOfTasks.add(task);		
	}
	
	public ArrayList<String> getTask() {
		return listOfTasks;
	}
		
}
