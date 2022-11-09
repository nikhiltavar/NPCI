package Day7.Guided;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

class Employee {
	
	int id;
	String name;
	double salary;
	
	public Employee() { 
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}
}

class CollectionMap{
	
	int id;
	HashMap<Integer, Employee> employeeMap = new HashMap<>();
	
	public int addEmployee(Employee employee){
		if(employee == null){
			return 1;
		}
		else if(this.employeeMap.containsKey(employee.id)){
			return 2;
		}
		
		this.employeeMap.put(employee.id, employee);
		
		return 0;
	}
	
	public int removeEmployee(Employee employee){
		if(employee == null){
			return 1;
		}
		else if(!this.employeeMap.containsKey(employee.id)){
			return 2;
		}
		
		this.employeeMap.remove(employee.id);
		
		return 0;
	}
	
	public Employee findEmployee(int employeeId){
		if(this.employeeMap.size() == 0 ||!this.employeeMap.containsKey(employeeId))
			return null;
		
		return this.employeeMap.get(employeeId);
	}
	
	public List<Employee> getEmployeeList(){
		if(this.employeeMap.size() == 0)
			return null;
		
		List<Employee> employeeList = new ArrayList<>();
		
		for(Map.Entry<Integer, Employee> val: this.employeeMap.entrySet()){
			employeeList.add(val.getValue());
		}
		
		return employeeList;
	}
	
}

public class TestEmployee {
	public static void main(String[] args) {
		Employee nikhil = new Employee(1,"Nikhil Tavar", 52234.23);
		Employee bhushan = new Employee(2,"Bhushan Graud", 24211.43);
		Employee nilesh = new Employee(3,"Nilesh Zalte", 30981.11);
		Employee vinayak = new Employee(4,"Vinayak Gaud", 42817.92);
		Employee shubham = new Employee(5,"Shubham Pandey", 38971.65);
		Employee hitesh = new Employee(6,"Hitesh Valodra", 42340.74);
		Employee aniket = new Employee(3,"Aniket Pawar", 35640.39);
		
		CollectionMap employees = new CollectionMap();
		
		System.out.println(employees.removeEmployee(null));
		System.out.println(employees.findEmployee(4));
		System.out.println(employees.getEmployeeList());
		
		System.out.println(employees.addEmployee(null));
		
		employees.addEmployee(nikhil);
		employees.addEmployee(bhushan);
		employees.addEmployee(nilesh);
		
		System.out.println(employees.addEmployee(nikhil));
		System.out.println(employees.getEmployeeList());
		
		System.out.println(employees.findEmployee(3));
		
		System.out.println(employees.removeEmployee(hitesh));
		System.out.println(employees.removeEmployee(null));
		
		System.out.println(employees.addEmployee(aniket));
		
		employees.addEmployee(shubham);
		employees.addEmployee(vinayak);
		
		System.out.println(employees.getEmployeeList());
		
		System.out.println(employees.removeEmployee(bhushan));
		System.out.println(employees.removeEmployee(bhushan));
		
		employees.removeEmployee(nikhil);
		employees.removeEmployee(nilesh);
		employees.removeEmployee(shubham);
		employees.removeEmployee(vinayak);
		
		System.out.println(employees.findEmployee(3));
		
		System.out.println(employees.getEmployeeList());
		
	}
	
}
