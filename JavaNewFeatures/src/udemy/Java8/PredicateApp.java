package udemy.Java8;

import java.util.function.Predicate;

public class PredicateApp {
	
	private static Integer AMOUNT = 20000;

	public static void main(String[] args) {
		beforJava8();
		afterJava8();

	}

	private static void beforJava8() {
		System.out.println("without Predicate");
		if(isGreater(AMOUNT)) {
			System.out.println("Amount can't be greater then 10000");
		}else {
			System.out.println("Amount is less then 10000");
		}
		
	}

	private static boolean isGreater(Integer amount) {
		if(amount > 10000)
			return true;
		return false;
	}

	private static void afterJava8() {
		Predicate<Integer> predicate = i -> i > 10000;
		if(predicate.test(AMOUNT)) {
			System.out.println("Amount can't be greater then 10000");
		}else {
			System.out.println("Amount is less then 10000");
		}
		
	}

}
