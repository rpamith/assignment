package ExcPositions;


import java.lang.reflect.Array;


public class ExchangePositions {

	public static void main(String[] args) {
		
		Integer arr[] = {10,20};
		 
			
			System.out.println("Before Exchange : " + arr[0] +" "+arr[1]);
			
			System.out.print("After Exchange : " );
			 
			ExchangeNum(arr);
			
		}

		public static <E> Void ExchangeNum(E[] arr ) {
			
			E temp= arr[1];
			arr[1] = arr[0];
			arr[0]= temp;
			System.out.println(arr[0]+ " " + arr[1]);
			return null; 



	}

}
