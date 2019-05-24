package udemy.Java8;

import java.util.Arrays;
import java.util.List;

public class ForEachApp {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		beforJava8(list);
		afterJava8(list);

	}

	private static void beforJava8(List<Integer> list) {
		
		for(int i : list) {
			System.out.print(i);
		}
		System.out.println("");
		
	}

	private static void afterJava8(List<Integer> list) {
		list.forEach(System.out::print);
		System.out.println("");
		
	}

}
