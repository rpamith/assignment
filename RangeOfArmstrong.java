package RangeOfArmstrong;

import java.util.Scanner;

public class RangeOfArmstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		FindArmstrong(a,b);
		
		}
	
	static void FindArmstrong(int a, int b) {
		for(int i=a; i<=b; i++) {
			int num = i;
			int sum = 0;
			int remainder = 0;
			
			while(num > 0) {
				remainder = num % 10;
				sum = sum + (remainder * remainder * remainder);
				num = num /10;
			}
			
			if (sum == i) {
				System.out.println(sum);
			}
		}
	}

}
