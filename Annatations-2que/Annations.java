package Annatations2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.*;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	int AuthorID();
	String Author() default "";
	String Supervisor() default "";
	String Date();
	String Time();
	int Version();
	String Description() default "";
}

@Info(AuthorID=1,Date="06/11/2021",Time="08:00",Version=1)
class Demo{
	@Info(AuthorID=1,Author="Amith",Date="07/11/2021",Time="08:00",Version=1)
	public void method1() {
		System.out.println("Inside Demo.method1");
	}
}


public class Annations {

	public static void main(String[] args) throws NoSuchMethodException,SecurityException{
		// TODO Auto-generated method stub
		
Demo obj = new Demo();
		
		Class c = obj.getClass();
		Annotation an = c.getAnnotation(Info.class);
		Info i = (Info)an;
		System.out.println("Anntation on Class\n");
		System.out.println("AuthorID:"+i.AuthorID()); 
		System.out.println("Author:"+i.Author()); 
		System.out.println("Supervisor:"+i.Supervisor()); 
		System.out.println("Date:"+i.Date()); 
		System.out.println("Time:"+i.Time()); 
		System.out.println("Version:"+i.Version()); 
		System.out.println("Description:"+i.Description());
		
		Method m = obj.getClass().getMethod("method1");
		Annotation an1= m.getAnnotation(Info.class);
		Info i1 = (Info)an1;
		System.out.println("\nAnntation on Method\n");
		System.out.println("AuthorID:"+i1.AuthorID()); 
		System.out.println("Author:"+i1.Author()); 
		System.out.println("Supervisor:"+i1.Supervisor()); 
		System.out.println("Date:"+i1.Date()); 
		System.out.println("Time:"+i1.Time()); 
		System.out.println("Version:"+i1.Version()); 
		System.out.println("Description:"+i1.Description());

	}

}
