
public class SalariedWorker extends Worker {
	
	 private double salariedWorkerPay;
	
	public SalariedWorker(String n, double salary) {
		super(n, salary); 
	}
	
	public SalariedWorker() {
		super();
	}
	
	public double getSalariedWorkerPay(double salary) {
		salariedWorkerPay = getWorkerSalaryRate(salary) * 12;
		return salariedWorkerPay;
		
	}

}
