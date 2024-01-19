package plant;

public class Garden {

	public static void main(String[] args) {
		Plant plant = new Plant();
		
		//plant.reference();
		plant.name();
		plant.leaves();
		plant.stem();
		plant.oxygen();
		
		System.out.println("-------------------------------");
		System.out.println();

		VenusFlyTrap venus = new VenusFlyTrap();
		
		//venus.reference();
		venus.nameOf();
		venus.type();
		venus.leaves();
		venus.stem();
		venus.oxygen();
		
		
	}

}
