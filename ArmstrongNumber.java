package Armstrong;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int temp =n;
		int r,sum=0;
		
		 while(n>0)
		 {
			 r=n%10;
			 n=n/10;
			 sum = sum + r*r*r;
		 }
		 if(temp == sum)
			 System.out.println("It is an Armstrong Number");
		 else
			 System.out.println("It is NOT an Armstrong Number");

	}

}
