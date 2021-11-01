package UnSupportedOper;

import java.util.Scanner;

public class UnSupported {

	public static void main(String[] args) {
		int a,b;
		Scanner r = new Scanner(System.in);
		
		System.out.println("Enter the divided:");
		a=r.nextInt();
		System.out.println("Enter the divisor:");
		b=r.nextInt();
		
		try {
			  name (a,b);
		} catch (UnsupportedOperationException  e) {
			System.out.println("Error:"+e.getMessage());
			
			if (e.getCause()!=null) {
				System.out.println("cause by:"+e.getCause());
			}
			
		}

	}
	public static void name(int a, int b) throws UnsupportedOperationException {
		
		try {
			 System.out.println(a/b);
		}catch (Exception e) {
			throw new UnsupportedOperationException("Exception:",e);
		}
		
	}

}
