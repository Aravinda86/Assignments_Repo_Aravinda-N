package weeklyassignments;

public class Program10_Inheritence_Employee {

	private int id;
	private String name;
	private double basicSalary;
	
	
	public Program10_Inheritence_Employee(int id, String name, double basicSalary) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	public double calculateSalary() {
		double HRA;
		double bonus;
		double totalSalary;
		
		HRA = basicSalary * 0.20;
		bonus = basicSalary * 0.10;
		totalSalary = HRA + bonus + basicSalary;
		
		return totalSalary;
		
	}
	
	public void display() {
		System.out.println(""
				+ "Employee ID: "+ this.id + "\n"
				+ "Employee Name: " + this.name + "\n"
				+ "Employee Basic Salary: "+ this.basicSalary + "\n"
				+ "Employee Total Salary:"+ calculateSalary());
		
	}
}
