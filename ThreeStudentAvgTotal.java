package ThreeStudent;

import java.util.Scanner;

public class ThreeStudentAvgTotal {

	public static void main(String[] args) {
		int a,b,c,d,e;
		System.out.println("enter marks of five subjects");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		
		int sum=a+b+c+d+e;
		System.out.println("Total marks"+sum);
		
		double avg=sum/5.0;
		System.out.println("average marks"+avg);
		
	}

}
