package CompoundInterest;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double amount;   // it will hold the C.I result
		double principal; // it wiil hold the principal money
		double rate; //it will hold rate of interest
		double time; //it will take time duration
		
		System.out.println("Enter principal amount:");
		principal = scanner.nextDouble();
		
		System.out.println("Enter the rate:");
		rate = scanner.nextDouble();
		
		System.out.println("Enter the time::");
		time = scanner.nextDouble();
		
		amount = principal * Math.pow((1+ rate /100), time);
		
		System.out.println("The compound interest is :"+amount);
		

	}

}
