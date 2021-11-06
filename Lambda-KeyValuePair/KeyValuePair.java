package KeyValuePair;

import java.util.HashMap;
import java.util.Map;

public class KeyValuePair {

	public static void main(String[] args) {
		HashMap<String, Integer> numbers= new HashMap<>();
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		StringBuilder stringBuilder = new StringBuilder();
		for(Map.Entry<String, Integer> entry:numbers.entrySet()) {
			stringBuilder.append(entry.getKey()).append(" ");
		}
		System.out.println(stringBuilder);

	}

}
