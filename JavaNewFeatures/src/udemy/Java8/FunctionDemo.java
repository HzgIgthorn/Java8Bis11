package udemy.Java8;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Integer usd = 10;
		beforeJava8(usd);
		afterJava8(usd);
		
		Function<String, String> f1 = s -> s.toLowerCase();
		Function<String, String> f2 = s -> s + " World";
		
		runAndThen(f1, f2);
		
		runCompose(f1, f2);
		
		runIdentity();
		
	}

	private static void beforeJava8(Integer usd) {
		
		Double inrValue = convertUsdToEuro(usd);
		System.out.println("Aus der beforeJava8: "+usd+ " USD sind " + inrValue+ " Euro");
	}

	private static void afterJava8(Integer usd) {
		Double euroRate = 9/10d;
		Function<Integer, Double> function = u -> u * euroRate;
		System.out.println("Aus der afterJava8: "+usd+ " USD sind " + function.apply(usd)+ " Euro");
	}

	private static Double convertUsdToEuro(Integer usd) {
		
		return 9*usd/10d;
	}
	
	/**
	 * andThen führt erst Function f1 aus und wendet auf das Ergebnis Function f2 an
	 * 
	 * @param f1 Function erste Funktion
	 * @param f2 Function zweite Funktion
	 */
	private static void runAndThen(Function<String, String> f1, Function<String, String> f2) {
		System.out.println("Ergebnis von f1: " + f1.apply("Hello"));
		System.out.println("Ergebnis von andThen: " + f1.andThen(f2).apply("Hello"));
		
	}

	/**
	 * compose führt erst Function f2 aus und wendet das Ergebnis auf Function f1 an
	 * 
	 * @param f1 Function erste Funktion
	 * @param f2 Function zweite Funktion
	 */
	private static void runCompose(Function<String, String> f1, Function<String, String> f2) {
		System.out.println("Ergebnis von f1: " + f1.apply("Hello"));
		System.out.println("Ergebnis von andThen: " + f1.compose(f2).apply("Hello"));
		
	}
	
	private static void runIdentity() {
		Function<String, String> f3 = Function.identity();
		System.out.println("Ergebnis von f3: " + f3.apply("Java8"));
		
	}
}
