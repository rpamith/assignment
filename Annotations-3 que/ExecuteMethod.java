package Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;



public class ExecuteMethod {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		MyClass obj =new MyClass();
		
		Method m1=obj.getClass().getMethod("myMethod1");
		Annotation an1 = m1.getAnnotation(Execute.class);
		Execute e1=(Execute)an1;
		
		
		Method m2=obj.getClass().getMethod("myMethod2");
		Method m3=obj.getClass().getMethod("myMethod3");

		
		Annotation an2 = m2.getAnnotation(Execute.class);
		Annotation an3 = m3.getAnnotation(Execute.class);
		
		Execute e2=(Execute)an2;
		Execute e3=(Execute)an3;
		System.out.println("Method 1 Seq: "+e1.Sequence()+"\nMethod 2 Seq: "+e2.Sequence()+"\nMethod 3 Seq: "+e3.Sequence());
		
	}

}
