package javaLearn;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {

	public static void main(String[] args) throws IOException {
		/*Stream<String> rows1 = Files.lines(Paths.get("out.txt"));
		int rowCount = (int)rows1
				.map(x -> x.split(","))
				.filter(x -> x.length == 3)
				.count();
		System.out.println(rowCount + " rows. ");
		rows1.close();*/
		Stream<String> rows3 = Files.lines(Paths.get("out.txt"));
		Map<String, Integer> map = new HashMap<>();
		map = rows3
				.map(x -> x.split(", "))
				.filter(x -> x.length == 3)
				.filter(x -> Integer.parseInt(x[1]) > 15)
				.collect(Collectors.toMap(
						x -> x[0],
						x -> Integer.parseInt(x[1])));
		rows3.close();
		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}

}
