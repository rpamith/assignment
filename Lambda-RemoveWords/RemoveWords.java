package RemoveWords;

import java.util.ArrayList;

public class RemoveWords {
	public static void main(String[]args) {
		ArrayList<String> Employee = new ArrayList<String>();
		Employee.add("Raju");
		Employee.add("Rani");
		Employee.add("Amith");
		Employee.add("Ajith");
		Employee.add("Sasi");
		Employee.add("Niyaz");
		Employee.removeIf(p->(p.charAt(0) == 'R'));
		System.out.println("Employee name does not exist with R");
		for(String str : Employee) {
			System.out.println(str);
		}
	}

}
