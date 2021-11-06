package FunctionalInterface;

import java.util.function.Function;

public class FunctionData {
	//3)function--both input and output

	public static void main(String[] args) {
		Function<Integer, String> getInt=t->t*2+"data multiplied by 2";
		System.out.println(getInt.apply(2));
		

	}

}
