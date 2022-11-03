package Day5.Guided;

public class EmployeeDetails {

	public static void main(String[] args) {
		PartTimeEmployee nik = new PartTimeEmployee(1, "Nikhil", "Tavar", "Titwala maharashtra", 45, 500 );
		System.out.println("Total Salary is: " + nik.computeSal());
		System.out.println("Full name is: " + nik.getFullName());
		nik.showDetails();
		System.out.println();
		
		FullTimeEmployee aniket = new FullTimeEmployee(2, "Aniket", "jadhav", "Ganesh road, Titwala", 34217, 2488.78 );
		System.out.println("Total Salary is: " + aniket.computeSal());
		System.out.println("Full name is: " + aniket.getFullName());
		aniket.showDetails();
	}

}

class Employee{
	
	int id;
	String firstName;
	String lastName;
	String address;
	
	public Employee() {
		
	}

	public Employee(int id, String firstName, String lastName, String address) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public String getFullName(){

		return this.firstName + " " + this.lastName;
	}
}

class PartTimeEmployee extends Employee{
	
	int hoursWorked;
	double amountPerHour;
	
	public PartTimeEmployee() {
		super();
	}
	
	public PartTimeEmployee(int id, String firstName, String lastName, String address, int hoursWorked, double amountPerHour) {
		super(id, firstName, lastName, address);
		this.hoursWorked = hoursWorked;
		this.amountPerHour = amountPerHour;
	}
	
	public double computeSal(){

		return this.hoursWorked* this.amountPerHour;
	}
	
	public void showDetails(){
		System.out.println("Id of employee is: " + super.id);
		System.out.println("First name of employee is: " + super.firstName);
		System.out.println("Last name of employee is: " + super.lastName);
		System.out.println("Address of employee is: " + super.address);
		System.out.println("Total working hours of employee is: " + this.hoursWorked);
		System.out.println("Employee hourly pay is: " + this.hoursWorked);
	}
}

class FullTimeEmployee extends Employee{
	
	double basic;
	double bonus;
	
	public FullTimeEmployee() {
		super();
	}
	
	public FullTimeEmployee(int id, String firstName, String lastName, String address, double basic, double bonus) {
		super(id, firstName, lastName, address);
		this.basic = basic;
		this.bonus = bonus;
	}
	
	public double computeSal(){

		return this.basic + this.bonus;
	}
	
	public void showDetails(){
		System.out.println("Id of employee is: " + super.id);
		System.out.println("First name of employee is: " + super.firstName);
		System.out.println("Last name of employee is: " + super.lastName);
		System.out.println("Address of employee is: " + super.address);
		System.out.println("Basic pay of employee is: " + this.basic);
		System.out.println("Employee bonus is: " + this.bonus);
	}
}
