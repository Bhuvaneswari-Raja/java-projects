
public class Person {
	
	private String name;
	private int birthYear;
	
	public Person(String n, int bY) {
		getName(n);
		getBirthYear(bY);
	}

	public Person() {
		name = "";
		birthYear = 0000;
	}

	public String getName(String name) {
		this.name = name;
		return name;
	}
	
	public int getBirthYear(int year) {
		birthYear = year;
		int age = birthYear - 2022;
		return age;
	}
	
}
