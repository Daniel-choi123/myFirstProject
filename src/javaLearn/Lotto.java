package javaLearn;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lotto {

	public static void main(String[] args) {
		/*IntStream intStream = new Random().ints(5,10);
		intStream
		.distinct()
		.limit(5)
		.forEach(System.out::println);
		IntStream intStream = IntStream.range(1,5);
		IntStream intStreeeam = IntStream.rangeClosed(1, 5);
		intStream.forEach(System.out::print);
		System.out.println("무야호~");
		intStreeeam.forEach(System.out::print);
		for(int i = 0; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("===========");
		
		Stream<Integer> evenStream = Stream.iterate(0, n->n+2);
		evenStream.limit(10).forEach(System.out::println);
		System.out.println("-=-=-=--=-=-=-=-=-=-=-");
		
		Stream<Integer> oneStream = Stream.generate(()->1);
		oneStream.limit(10).forEach(System.out::println);*/
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
				.summaryStatistics();
		System.out.println(summary);
		
	}

}