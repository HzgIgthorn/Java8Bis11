package udemy.Java8;

public interface StaticMethodAfter8 {
	
	/**
	 * Methode auf Classen-Nivau, kann direkt über das Interface aufgerufen werden ohne eine Instance von
	 * einer implementierenden Classe zu erzeugen. Muss ein Objekt von dem Interface erzeugen um eine
	 * default Method zu benutzen. Static Methoden können nicht von einer erbenden Klasse überschrieben
	 * werden.
	 */
	static public void caUtilityMethod() {
		System.out.println("This is a utility method");
		StaticMethodAfter8 after = new StaticMethodAfter8() {
		};
		
		after.test();
	}
	
	default public void test() {
		System.out.println("das ist ein Test");
	}
}

interface StaticMethodTest extends StaticMethodAfter8{
	
	/**
	 * Eine statische Methode kann aber von einem erbenden Interface überschrieben werden
	 */
	static public void caUtilityMethod() {
		System.out.println("This is an other utility method");
		
		StaticMethodAfter8 after = new StaticMethodAfter8() {
		};
		
		after.test();
	}
}

class ClassM1 implements StaticMethodAfter8{
	
	public static void main(String[] args) {
		StaticMethodAfter8.caUtilityMethod();
	}
	
	static public void test1() {
		System.out.println("static method are allowed in classes as well");
	}
}
