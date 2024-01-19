import java.util.LinkedHashMap;

//import java.util.Scanner;
//import java.util.ArrayList;


public class LoginInfo {
	
	LinkedHashMap<String, String> login = new LinkedHashMap<String, String>();
	
	
	public void setLogin(String userNew, String passwordNew) {
		login.put(userNew, passwordNew);
	}
	
	public LinkedHashMap<String, String> getLogin() {
		login.put("Raja", "king123");
		login.put("Kala", "queen123");
		login.put("Pooja", "college123");
		login.put("Nandhini", "school123");
		return login;
	}
	
	
}
