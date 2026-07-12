package weeklyassignments;

public class Program9_Inheritence_Student extends Program9_Inheritence_Person{

	private float marks;
	
	public Program9_Inheritence_Student(String name, int age, float marks) {
		super(name, age);
		this.marks = marks;
		
	}

	public void display() {
		System.out.println(""
				+ "Student Name: " + getName() 
				+  "\n"
				+ "Student Age: " + getAge()
				+ "\n"
				+ "Marks Obtained: " + this.marks);
		
	}
	
	
}
