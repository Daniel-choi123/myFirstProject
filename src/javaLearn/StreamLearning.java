package javaLearn;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamLearning {

	public static void main(String[] args) throws IOException {
		/*IntStream.range(1,  10).skip(5).forEach(x -> System.out.println(x));
		System.out.println();
		
		Stream.of("이주미", "최윤진", "최영하", "최시아", "돼지")
		.filter(x -> x.startsWith("최"))
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("======================");
		
		Arrays.stream(new int[] {2, 4, 6, 8, 10})
		.map(x -> x * x)
		.average()
		.ifPresent(System.out::println);
		List<String> people = Arrays.asList("Al", "BS", "sdg", "Gookbap", "appel");
		people.stream()
		.map(String::toLowerCase)
		.filter(x -> x.startsWith("a"))
		.forEach(System.out::println);*/
		Stream<String> powers = Files.lines(Paths.get("Power.txt"));
		powers
		.sorted()
		//.filter(x -> x.length() >2)
		.filter(x -> x.contains("Choi")) 
		.forEach(System.out::println);
		powers.close();
		
	}

}
