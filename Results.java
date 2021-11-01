package Results;

import java.util.Scanner;

public class Results {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float [] marks = new float[3];
		float sum=0, avg;
		int i;
		try(Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter marks got in three subjects:");
			 for (i=0; i<3; i++)
				 marks[i]=scan.nextFloat();
			 
		}
		
		for (i=0; i<3; i++)
			sum = sum+ marks[i];
		avg = sum/3;
		System.out.println("\nGrade =");
		
		if (avg>= 60)
			System.out.println("pass");
		if(avg<60)
			System.out.println("fail");
		

	}

}
