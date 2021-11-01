package IncomeTax;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double incometax=0,it;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the income::");
		it = scan.nextDouble();
		if (it<=180000)
			incometax = 0;
		else if (it<= 300000)
			incometax = 0.1*(it-180000);
		else if (it <=500000)
			incometax = (0.3 *(it-500000))+(0.2 * 200000)+(0.1 *100000);
		System.out.println("Income tax amount is"+incometax);
	}

}
