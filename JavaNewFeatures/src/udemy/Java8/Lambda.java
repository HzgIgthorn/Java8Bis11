package udemy.Java8;

interface AddInterface{
	public int addTwoNumbers(int a, int b);
}

interface DisplayInterface{
	public void displayJff();
}

public class Lambda {

	public static void main(String[] args) {
		Lambda lambda = new Lambda();
		System.out.println("Ergebnis: " + lambda.addTwoNumbers(1, 2));
		
		lambda.displayJff();
		
		AddInterface addInterface = (a,b) -> {
			System.out.println("Innerhalb der Lambda-Expression");
			int res = a + b;
			return res;
		};
		resNumbers(addInterface);
		
		DisplayInterface displayInterface = () -> System.out.println("Hello Jff");
		displayInterface.displayJff();

	}
	
	public int addTwoNumbers(int a, int b) {
		return a+b;
	}
	
	public void displayJff() {
		System.out.println("Hello Jff");
	}
	
	private static void resNumbers(AddInterface add) {
		System.out.println("Starte resNumbers");
		System.out.println("Ergebnis: " + add.addTwoNumbers(1, 2));
		System.out.println("Ende von resNumber");
	}

}
