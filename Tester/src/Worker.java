public class Worker {

	private String workerName;
	private double workerSalaryRate;

	public Worker(String n, double salary) {
		getWorkerName(n);
		getWorkerSalaryRate(salary);

	}

	public Worker() {
		workerName = "";
		workerSalaryRate = 0.00;
	}

	public String getWorkerName(String name) {
		workerName = name;
		return workerName;
	}

	public double getWorkerSalaryRate(double salaryRate) {
		workerSalaryRate = salaryRate;
		return workerSalaryRate;
	}

}