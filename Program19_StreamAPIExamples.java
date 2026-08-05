package weeklyassignments;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private int age;
    
	public Employee(int id, String name, String department, double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class Program19_StreamAPIExamples {

	public static void main(String[] args) {
		Employee obj1 = new Employee(101, "Sham", "Accounts", 25000, 30);
		Employee obj2 = new Employee(102, "Ankit", "Engineering", 50000, 29);
		Employee obj3 = new Employee(103, "Harsha", "HR", 70000, 33);
		Employee obj4 = new Employee(104, "Daivik", "Engineering", 45000, 28);
		Employee obj5 = new Employee(105, "Sheetl", "HR", 55000, 27);
		Employee obj6 = new Employee(106, "Sri", "Accounts", 60000, 30);
		Employee obj7 = new Employee(107, "Gowri", "Engineering", 90000, 40);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(obj1);list.add(obj2);list.add(obj3);list.add(obj4);
		list.add(obj5);list.add(obj6);list.add(obj7);
		
		System.out.println("Displaying the Employees Name who has age more than 30");
		System.out.println("-------------------------------------------------------");
		list.stream().filter(s->s.getAge() >= 30).forEach(s->System.out.println(s.getName()+":"+s.getAge()));
		
		System.out.println();
		
		System.out.println("Displaying the Employees Name who belongings to Engineering team in asecending");
		System.out.println("-------------------------------------------------------------------------------");
		
		List<Employee> dList =
		list.stream()
		.filter(dept->dept.getDepartment().equals("Engineering"))
		.sorted(Comparator.comparing(Employee :: getName)).toList();
		dList.forEach(s->System.out.println(s.getName()+" : "+s.getDepartment()));
		
		System.out.println("Displaying the Employees Name and the salary hike by 10%");
		System.out.println("---------------------------------------------------------");
		double hike = 1.10;
		List<Employee> mList = 
			list.stream()
			.map(sal ->{
				sal.setSalary(sal.getSalary()*hike);
				return sal;
			}).toList();
		mList.forEach(sal->{
			String salary = String.format("%.2f", sal.getSalary());
			System.out.println(sal.getName()+" : "+ salary);
		});
		
	}

}
