package udemy.Java8;

import java.util.function.Consumer;

public class ConsumerApp {
	
	public static void main(String[] args) {
		beforJava8();
		afterJava8();
	}

	private static void beforJava8() {
		displayInUpperCase("Java 8");
		
	}

	private static void displayInUpperCase(String string) {
		System.out.println(string.toUpperCase());
		
	}

	private static void afterJava8() {
		Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
		consumer.accept("Java 8");
	}

}
