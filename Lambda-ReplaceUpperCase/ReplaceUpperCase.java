package ReplaceUpperCase;

import java.util.ArrayList;
import java.util.function.UnaryOperator;


class op implements UnaryOperator<String>{
	public String apply(String str) {
		return str.toUpperCase();
	}
	
}

public class ReplaceUpperCase {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("my");
		list.add("name");
		list.add("is");
		list.add("RP AMITH KUMAR");
		list.add("i am doing");
		list.add("lambdas");
		System.out.println("Contents of the list : "+list);
		list.replaceAll(new op());
		System.out.println("Contents of the list after replace operation: \n"+list);
	}

}
