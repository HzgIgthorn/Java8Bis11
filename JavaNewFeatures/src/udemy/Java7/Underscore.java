package udemy.Java7;

public class Underscore {

	public static void main(String[] args) {
		beforeJava7();
		fromJava7();
	}

	private static void beforeJava7() {
		int creditCardNummer = 12345678;
		System.out.println("Creditkarten Nummer " + creditCardNummer);
	}

	private static void fromJava7() {
		int creditCardNummer = 1234_5678;
		System.out.println("Creditkarten Nummer " + creditCardNummer);
	}

}
