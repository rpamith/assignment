package LambdaArthematic;

interface Arthmetic{
	int operations(int a, int b); 
}

public class LambdaArthmetic {

	public static void main(String[] args) {
		// addition operation
		Arthmetic addition =( int a ,int b)-> (a+b);
		// subtraction operation
		Arthmetic subtraction = (int a, int b) ->(a-b);
		// multi operation
		Arthmetic multi = (int a,int b) ->(a*b);
		// div operation
		Arthmetic div = (int a, int b) ->(a/b);
		System.out.println("additon =>"+ addition.operations(10, 20));
		System.out.println("subtraction =>"+ subtraction.operations(20,10));
		System.out.println("multi =>"+ multi.operations(10, 20));
		System.out.println("div =>"+ div.operations(2000,1000));
		
		

	}

}
