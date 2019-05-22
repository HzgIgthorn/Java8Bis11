package udemy.Java8;

@FunctionalInterface
public interface FunctionalInter {
	public void functionalMethod();
	
	default public void defaultMethod() {
		System.out.println("The default Method.");
	}
	
	static public void staticMethod() {
		System.out.println("The static Method.");
	}

	@Override
	boolean equals(Object arg0);
}
