package udemy.Java8;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamApp {
	
	final static int MAX = 70000;

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(MAX);
		for(int i = 0; i < MAX; i++)
			list.add(i);
		
		Instant startSeq = Instant.now();
		sequentialStream(list);
		Instant endSeq = Instant.now();
		System.out.println("Sequential Stream Duration: " + Duration.between(startSeq, endSeq).toMillis());
		
		Instant startPar = Instant.now();
		parallelStream(list);
		Instant endPar = Instant.now();
		System.out.println("Parallel Stream Duration: " + Duration.between(startPar, endPar).toMillis());

	}

	private static void sequentialStream(List<Integer> list) {
		list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		
	}

	private static void parallelStream(List<Integer> list) {
		list.parallelStream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		
	}

}
