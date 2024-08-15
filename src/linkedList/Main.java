package linkedList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
//		LinkedList list = new LinkedList();
//		int[] arr = {2,3,4,5,6,9,7,10,12};
//		Node head = list.makeLinkedList(arr);
//		list.printLinkedList(head);
//		System.out.println();
//		System.out.println(list.findMiddle(head));
		
		//i/o: "1:one,2:two,3:three"
		//o/p: {{1:one},{2:two},{3:three}}
		
		String input = "1:one,2:two,3:three";
		Map<String, String> result = Stream.of(input.split("[,]"))
	            .map(pair -> pair.split(":"))
	            .collect(Collectors.toMap(
	                keyValue -> keyValue[0],  // Key
	                keyValue -> keyValue[1]   // Value
	            ));
		for(Map.Entry ele: result.entrySet()) {
			System.out.println(ele.getKey() +" "+ele.getValue());
		}
//		Map<Integer,String> map = input.
		
		String name = "hemantranjan";
		Map<String,Long> charMap = Arrays.stream(name.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(charMap);
		Map<Character,Integer> map = new HashMap();
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
		
//		java reflections
//		pagination
//		sync time in java
		 

	}

}
