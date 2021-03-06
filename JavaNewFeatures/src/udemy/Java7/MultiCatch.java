package udemy.Java7;

public class MultiCatch {
	
	static int caArray[] = new int[5];

	public static void main(String[] args) {
		beforeJava7();
		fromJava7();

	}

	private static void beforeJava7() {
		try {
			int result = 100/0;
			System.out.println("result: " + result);
			System.out.println(caArray[10]);
		}catch(ArithmeticException e) {
			System.out.println("Exception: "  + e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: "  + e.getMessage());
		}
	}
	
	private static void fromJava7() {
		try {
			int result = 100/0;
			System.out.println("result: " + result);
			System.out.println(caArray[10]);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			if(e instanceof ArithmeticException) {
				System.out.println("ArithmeticException: "  + e.getMessage());
			}else if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("ArrayIndexOutOfBoundsException: "  + e.getMessage());
			}
		}
		
	}


}
