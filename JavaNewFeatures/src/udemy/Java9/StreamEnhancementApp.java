package udemy.Java9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEnhancementApp {
	
	static List<Integer> list = Arrays.asList(50,60,80,90,40,30,20,10);

	public static void main(String[] args) {
		takeWhile();
		dropWhile();
		ofNullable();
	}

	private static void takeWhile() {
		List<Integer> takeWhileList = list.stream().takeWhile(i -> i < 80).collect(Collectors.toList());
		System.out.println("takeWhileList ist: " + takeWhileList);
		
	}
	
	private static void dropWhile() {
		List<Integer> dropWhileList = list.stream().dropWhile(i -> i < 80).collect(Collectors.toList());
		System.out.println("takeWhileList ist: " + dropWhileList);
		
	}
	
	private static void ofNullable() {
		List<Integer> nullList = null;
		List tempList = Stream.ofNullable(nullList).collect(Collectors.toList());
		List tempList2 = Stream.ofNullable(list).collect(Collectors.toList());
		System.out.println("ofNullable1: " + tempList);
		System.out.println("ofNullable2: " + tempList2);
		
	}

}
