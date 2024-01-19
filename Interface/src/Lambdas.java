 
public class Lambdas {
	
	public static void main(String[] args) {
		//Lion lionNew = new Lion();
		
		Animal lion = () -> System.out.println("Panthera leo");
		lion.getSpecies();
		
		Animal human = () -> System.out.println("homo sapiens");
		human.getSpecies();
	}

}
