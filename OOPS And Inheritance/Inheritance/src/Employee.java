
public class Employee extends Person {
	private double salary;
	private int year;
	private String insuranceNumber;
	public Employee(String name, double salary, int year, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.year = year;
		this.insuranceNumber = insuranceNumber;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	@Override
	public String toString() {
		return "Employee [Name="+super.toString()+"salary=" + salary + ", year=" + year + ", insuranceNumber=" + insuranceNumber + "]";
	}
	

}
