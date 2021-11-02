package RandomValues;

import java.util.HashMap;

public class HoldRandomValues {

	public static void main(String[] args) {
		HashMap<Integer, Double> r= new HashMap<>();
		
		
		r.put(100,100.0);
		r.put(200, 201.0);
		r.put( 300,300.05);
		r.put(400,400.10);
		r.put(500, 500.01);
		r.put(10, 10.0);
		r.put(1000, 1000.01);
		r.put(550, 550.05);
		r.put(20,20.10);
		r.put(30,30.01);
		
		
		System.out.println(r);
	}

}
