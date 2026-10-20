package t13_streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Count each character of a string (streams vs HashMap)
public class Q03_CharacterFrequency {



	public static void main(String[] args) {
		String name = "hemantranjan";
		Map<String,Long> charMap = Arrays.stream(name.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(charMap);
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
		System.out.println(map);
	}
}
