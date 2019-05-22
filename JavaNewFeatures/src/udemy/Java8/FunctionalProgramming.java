package udemy.Java8;

import java.lang.annotation.Annotation;

public class FunctionalProgramming{
	public static void main(String[] args) {

		/**
		 * Wir definieren die Logik der Methode addTwoNumbers mit einem Lambda-Ausdruck
		 */
		FunctionalInterface app = (a,b) -> a+b;
		System.out.println("Ergebnis ist: " + app.addTwoNumbers(1, 2));
		
		/**
		 * Wir weisen der Methode callTwoNumbers ihre Logik über das Interface FunctionalInterface zu.
		 * Die Logik wird dann durch den Aufruf der einzigen Methode in callTwoNumbers ausgeführt
		 */
		callTwoNumbers((a,b) -> a+a+b, 1 , 2);
		
		/**
		 * Wir können als Reference auch eine Methode aus der aufrufenden Klasse übergeben. Diese kann
		 * dann auch als Aufruf der einzigen Methode im Interface aufgerufen werden. Beide Methoden müssen
		 * gleiche Parameter und gleichen Rückgabewert haben
		 */
		ReferenceInterface ref = FunctionalProgramming::staticMethodReference;
		ref.methodReference();
		
		/**
		 * Auch Methodenreferenzen können mit einem Lambda-Ausdruck übergeben werden.
		 */
		ReferenceInterface reg = () -> FunctionalProgramming.staticMethodReference();
		reg.methodReference();
		
		/**
		 * Bei nicht statischen Methoden muss die Methodenreferenz über ein Objekt der Klasse aufgerufen werden,
		 * sonst funktioniert alles gleich
		 */
		FunctionalProgramming apq = new FunctionalProgramming();
		ReferenceInterface reh = apq::objectMethodReference;
		reh.methodReference();
		
		
	}
	
	private static void callTwoNumbers(FunctionalInterface inter, int a, int b) {
		System.out.println("Ergebnis ist: " + inter.addTwoNumbers(a, b));
		
	}
	
	private static void staticMethodReference() {
		System.out.println("Hier mit Methoden Reference.");
	}
	
	private void objectMethodReference() {
		System.out.println("Hier Methodenreference mit einem Objekt");
	}

	interface FunctionalInterface {
		public int addTwoNumbers(int a, int b);
	}
	
	interface ReferenceInterface{
		public void methodReference();
	}
}
