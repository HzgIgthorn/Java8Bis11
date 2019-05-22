package udemy.Java7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DiamondOperator {

	public static void main(String[] args) {
		beforeJava7();
		fromJava7();

	}

	private static void fromJava7() {
		List<Map<String,List<String>>> list = new ArrayList<>();
		
	}

	private static void beforeJava7() {
		List<Map<String,List<String>>> list = new ArrayList<Map<String,List<String>>>();
		
	}

}
