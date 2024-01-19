import java.util.Scanner;

public class Test {
  public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter name: ");
		String name = scan.next();
		System.out.print("Enter salary: ");
		double salary = scan.nextDouble();
		System.out.print("Hourly or Salaried? ");
		String workerType = scan.next();
		
		Worker person1 = new Worker(name, salary);
		System.out.println("----------Worker----------");
		System.out.println("Worker name: " + person1.getWorkerName(name));
		System.out.println("Worker salary: " +person1.getWorkerSalaryRate(salary));
		
		
		if(workerType.equalsIgnoreCase("Hourly")) {
			HourlyWorker  person2 = new HourlyWorker(name, salary);
			System.out.println("----------Hourly Worker----------");
			System.out.println("Worker name: " + person2.getWorkerName(name));
			System.out.println("Worker hourly salary: " +person2.getHourlyPay(salary));
		} else {
			SalariedWorker person3 = new SalariedWorker(name, salary);
			System.out.println("----------Salaried Worker----------");
			System.out.println("Worker name: " + person3.getWorkerName(name));
			System.out.println("Worker annual salary: " +person3.getSalariedWorkerPay(salary));
		}
		
		

		
  }

}