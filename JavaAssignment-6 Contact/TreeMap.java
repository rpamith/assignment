package Contact;

import java.util.Collections;
import java.util.Map;

public class TreeMap {

	public static void main(String[] args) {
		
		Contact obj1 = new Contact(9876543210L, "AmithKumar", "ak@gmail.com", "Male");
		Contact obj2 = new Contact(9876543200L, "AjithKumar", "aj@gmail.com", "Male");
		Contact obj3 = new Contact(9876543000L, "Anjali", "anjali@gmail.com", "Female");
		
		Map<Long,Contact> data = new java.util.TreeMap<Long,Contact>(Collections.reverseOrder());
		
		data.put(9876543210L, obj1);
		data.put(9876543200L, obj2);
		data.put(9876543000L, obj3);
		
		System.out.println("keys :"+data.keySet()+"\n");
		System.out.println("values :" +data.values()+"\n");
		System.out.println(data +"\n");
		

	}

}
