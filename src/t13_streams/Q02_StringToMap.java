package t13_streams;

import t00_common.Console;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Convert "1:one,2:two,3:three" into a map using streams
public class Q02_StringToMap {



	public static void main(String[] args) {
		Console.header("Java Streams · Convert \"1:one,2:two,3:three\" into a map using streams");
		//i/o: "1:one,2:two,3:three"
		//o/p: {{1:one},{2:two},{3:three}}
		String input = "1:one,2:two,3:three";
		Map<String, String> result = Stream.of(input.split("[,]"))
	            .map(pair -> pair.split(":"))
	            .collect(Collectors.toMap(
	                keyValue -> keyValue[0],  // Key
	                keyValue -> keyValue[1]   // Value
	            ));
		for(Map.Entry<String, String> ele: result.entrySet()) {
			System.out.println(ele.getKey() +" "+ele.getValue());
		}
	}
}
