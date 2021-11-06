package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
	int Sequence();
}



public class MyClass {
	@Execute(Sequence = 2)
	public void myMethod1() {
		System.out.println("This method should be displayed second");
	}
	
	@Execute(Sequence = 3)
	public void myMethod2() {
		System.out.println("This method should be displayed First");
	}
	
	@Execute(Sequence = 1)
	public void myMethod3() {
		System.out.println("This method should be displayed Third");
	}

}
