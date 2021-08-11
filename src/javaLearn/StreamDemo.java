package javaLearn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		/*List<Integer> list = Arrays.asList(1,2,5,4,3);
		Stream<Integer> intStream = list.stream().sorted();
		intStream.forEach(System.out::print);
		
		
		intStream = list.stream();
		intStream.forEach(System.out::print);
		
		Stream<String> strStream = Stream.of("a", "b", "c");
		strStream.forEach(System.out::print);
		//System.out.println(strStream.count());*/
		
		int[] intArr = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArr);
		System.out.println("count="+intStream.count()); 
		//System.out.println("sum="+intStream.sum());
		//System.out.println("average="+intStream.average());

	}

}
