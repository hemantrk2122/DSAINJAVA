package t13_streams;

import t00_common.Console;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Count each character of a string (streams vs HashMap)
public class Q03_CharacterFrequency {



	public static void main(String[] args) {
		Console.header("Java Streams · Count each character of a string (streams vs HashMap)");
		String name = "hemantranjan";
		Map<String,Long> charMap = Arrays.stream(name.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Console.result("charMap", charMap);
		Map<Character,Integer> map = new HashMap<>();
		char[] charArray = name.toCharArray();
		for(int i = 0;i<charArray.length;i++) {
			char ch = charArray[i];
			if(map.get(ch)==null) {
				map.put(ch, 1);
			}else {
				map.put(ch, map.get(ch)+1);
			}
		}
		Console.result("map", map);
	}
}
