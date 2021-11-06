package FunctionalInterface;

import java.util.function.Predicate;

public class MainClass1 {
     	// Functional Interface types--4 
		//1)Predicate--BOOLEAN RESULT


	public static void main(String[] args) {
		Predicate<String> checklength=str->str.length()>6;
		//checking if the length of string greater then six--true or false
		System.out.println(checklength.test("AMITHKUMAR RP"));
		

	}

}
