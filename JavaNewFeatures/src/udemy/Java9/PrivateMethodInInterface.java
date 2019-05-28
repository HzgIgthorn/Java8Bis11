package udemy.Java9;

import java.util.Random;

public interface PrivateMethodInInterface {
	
	static void displayRandomNumber() {
		System.out.println("Random Number: " + generateRandom());
	}
	
	static void displayRandomNumberABC() {
		String append = "ABC"+generateRandom();
		System.out.println("Random Number: " + append);
	}
	
	private static int generateRandom() {
		Random random = new Random();
		int number = random.nextInt(500000);
		return number;
	}

}
