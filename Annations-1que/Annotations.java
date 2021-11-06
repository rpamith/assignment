package Annations1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.*;
import java.lang.reflect.Method;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	String testCase() default "This is testcase";
}



public class Annotations {

	public static void main(String[] args) throws NoSuchMethodException,SecurityException {
		
		
		TestCase obj = new TestCase();
		obj.method1();
		
		Method m = obj.getClass().getMethod("method1");
		Annotation an= m.getAnnotation(Test.class);
		Test t=(Test)an;
		System.out.print(t.testCase());

	}

}


class TestCase{
	
	@Test(testCase="This is also a testcase")
	public void method1() {
		System.out.println("Inside method1");
	}
}
