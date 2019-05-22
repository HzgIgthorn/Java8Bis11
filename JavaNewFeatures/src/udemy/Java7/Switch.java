package udemy.Java7;

public class Switch {
	
	final static String JAVA7 = "Java7";
	final static String JAVA8 = "Java8";
	final static String JAVA9 = "Java9";
	final static String JAVA10 = "Java10";
	final static String JAVA11 = "Java11";


	public static void main(String[] args) {
		String param = "Java7";
		beforeJava7(param);
		fromJava7(param);
	}

	private static void fromJava7(String param) {
		if(JAVA7.equals(param)) {
			System.out.println("Java Version ist Java7.");
		}else if(JAVA8.equals(param)) {
			System.out.println("Java Version ist Java8.");
		}else if(JAVA9.equals(param)) {
			System.out.println("Java Version ist Java9.");
		}else if(JAVA10.equals(param)) {
			System.out.println("Java Version ist Java10.");
		}else if(JAVA11.equals(param)) {
			System.out.println("Java Version ist Java11.");
		}else {
			System.out.println("Java Version ist zu alt.");
		}
		
	}

	private static void beforeJava7(String param) {
		switch(param) {
		case JAVA7:
			System.out.println("Java Version ist Java7.");
			break;
		case JAVA8:
			System.out.println("Java Version ist Java8.");
			break;
		case JAVA9:
			System.out.println("Java Version ist Java9.");
			break;
		case JAVA10:
			System.out.println("Java Version ist Java10.");
			break;
		case JAVA11:
			System.out.println("Java Version ist Java11.");
			break;
		default:
			System.out.println("Java Version ist zu alt.");
		}
		
	}

}
