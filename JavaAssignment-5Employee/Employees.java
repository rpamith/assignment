package Employee;

import java.util.HashSet;
import java.util.Iterator;

public class Employees {

	public static void main(String[] args) {
		
		Employee obj1 = new Employee(14356, "Amith kumar", 25000);
		Employee obj2 = new Employee(14357, "RP", 30000);
		
		HashSet<Employee> empDetails = new HashSet<>();
		
		empDetails.add(obj1);
		empDetails.add(obj2);
		
		Iterator<Employee> iterate = empDetails.iterator();
		while (iterate.hasNext()) {
			 
			iterate.next().display();
			System.out.println();
			
		}
	}
}

class Employee {
		
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	int id;
	String name;
	int salary;
	
	public void display() {
		System.out.println("ID : " + id);
		System.out.println("Name : "+ name );
		System.out.println("Salary : " + salary);
	}

}
