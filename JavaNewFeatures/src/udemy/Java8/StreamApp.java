package udemy.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApp {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<String> versions = Arrays.asList("Java 7","Java 8","Java 9","Java 10","Java 11","Java 12");
		
		beforJava8(list, versions);
		afterJava8(list, versions);
	}

	private static void beforJava8(List<Integer> list, List<String> versions) {
		List<Integer> even = new ArrayList<>(10);
		
		for(Integer i : list) {
			if(i % 2 == 0) {
				even.add(i);
			}
		}
		System.out.println("List der gerade Zahlen ist: " + even);
		
		List<String> res = new ArrayList<>(10);
		
		for(String string : versions) {
			res.add(string.toUpperCase());
		}
		System.out.println("List der Java-Versionen: " + res);
		
		List<String> multi = new ArrayList<>(30);
		
		for(String string : versions) {
			multi.add(string.toUpperCase());
			multi.add(string.toLowerCase());
			multi.add(string.concat(" JFF"));
		}
		System.out.println("Map der Java-Versionen: " + multi);
		
	}

	private static void afterJava8(List<Integer> list, List<String> versions) {
		System.out.println("List der gerade Zahlen ist: " + list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));
		
		System.out.println("List der Java-Versionen: " + versions.stream().map(s -> s.toUpperCase()).collect(Collectors.toList()));
		
		System.out.println("Map der Java-Versionen: " + versions.stream().flatMap(s -> Stream.of(s.toUpperCase(),s.toLowerCase(),s.concat(" JFF"))).collect(Collectors.toList()));
		
	}

}
