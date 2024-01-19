public class HourlyWorker extends Worker {

	private double hourlyWorkerPay;
	

	public HourlyWorker(String n, double salary) {
		super(n, salary);
	}

	public HourlyWorker() {
		super();
		hourlyWorkerPay = 0;
	}

	public double getHourlyPay(double salary) {
		hourlyWorkerPay = getWorkerSalaryRate(salary) * 40;
		return hourlyWorkerPay;
	}
	
	
}