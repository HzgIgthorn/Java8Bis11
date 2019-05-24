package udemy.Java8;

import java.util.function.Supplier;

public class SupplierApp {
	
	public static void main(String[] args) {
		beforJava8();
		afterJava8();
	}

	private static void beforJava8() {
		double euroRate = getEuroRate();
		System.out.println("1 US-Dollar entspricht "+ euroRate + " Euro.");
		
	}

	private static double getEuroRate() {
		return 0.9d;
	}

	private static void afterJava8() {
		Supplier<Double> supplier = () -> 0.9d;
		System.out.println("1 US-Dollar entspricht "+ supplier.get() + " Euro.");
		
	}

}
