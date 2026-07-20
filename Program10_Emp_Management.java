package weeklyassignments;

class EmployeeManagement {

	private int empId;
	private String empName;
	private float empSalary;
	
	private static String companyName = "ABC Technologies";

	public EmployeeManagement(int empId, String empName, float empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public static void displayCompanyName() {
		System.out.println("Company Name:"+ companyName);
	}
	
	public void displayEmployeeDetails() {
		System.out.println("\n Employee Details"
						+"\n"
						+"------------------");
		System.out.println("Employee ID:"+ empId);
		System.out.println("Employee Name:"+ empName);
		System.out.println("Employee Salary:"+ empSalary);
							
	}
	
}

public class Program10_Emp_Management{
	public static void main(String args[]) {
		EmployeeManagement obj1 = new EmployeeManagement(101, "Rahul", 34000.89f);
		EmployeeManagement obj2 = new EmployeeManagement(102, "Sakshi", 55000.566f);
		EmployeeManagement obj3 = new EmployeeManagement(103, "Gopal", 57800.78f);
		EmployeeManagement.displayCompanyName();
		obj1.displayEmployeeDetails();
		obj2.displayEmployeeDetails();
		obj3.displayEmployeeDetails();
	}
}
