package FunctionalInterface;

import java.util.function.Consumer;

class Employee{
	private String name;
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
}

public class ConsumerData {
	//2)consumer--modifies data--no output

	public static void main(String[] args) {
		Employee E=new Employee();
		Consumer<Employee> setName=t->t.setName("AMITHKUMAR");
		setName.accept(E);
		System.out.println(E.getName());
		
		

	}

}
