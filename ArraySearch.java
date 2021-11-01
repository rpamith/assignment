package ArraySearch;

public class ArraySearch {

	public static void main(String[] args) {
		int [] values= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47 };
		
		for (int i=0; i< values.length; i++) {
			if (values[i]==19) {
				System.out.println("value is inside array and the index is ::"+i);
			}
			
		}
	}

}
