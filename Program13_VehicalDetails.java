package weeklyassignments;

class Vehical{
	private String brand;
	private int year;
	
	public Vehical(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}
	
	public void displayVehicleInfo() {
		System.out.println("Vehicle Information"
						+"\n"
						+ "--------------------");
		System.out.println("Brand:"+ brand);
		System.out.println("Year:"+ year);
	}
}

class Car extends Vehical{
	private String model;
	
	Car(String brand, int year, String model){
		super(brand, year);
		this.model = model;
	}
	public void displayVehicleInfo() {
		super.displayVehicleInfo();
		System.out.println("\n"
						+"Car Information"
						+"\n"
						+ "----------------");
		System.out.println("Model:"+ model);
	}
}

public class Program13_VehicalDetails {

	public static void main(String[] args) {
		Car obj = new Car("Toyota", 2021, "Fortuner");
		obj.displayVehicleInfo();
	}

}
