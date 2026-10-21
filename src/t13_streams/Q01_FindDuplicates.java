package t13_streams;

import t00_common.Console;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// Print the duplicate elements of an array using streams
public class Q01_FindDuplicates {



	public static void main(String[] args) {
		Console.header("Java Streams · Print the duplicate elements of an array using streams");
		int[] arr = {1,2,3,1,2,4,5};
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		list.stream()
		.filter(i->Collections.frequency(list, i)>1)
		.distinct()
		.forEach(System.out::println);
	}
}
