package FunctionalInterface;

import java.util.function.Supplier;

public class SupplierData {

	public static void main(String[] args) {
		Supplier<Double> getRandomDouble=()->Math.random();
		System.out.println(getRandomDouble.get());// NO input 

	}

}
