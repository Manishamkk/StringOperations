package string.examples2;

import java.util.HashMap;
import java.util.Map;

public class EachWordInStringCount {

	public static void main(String[] args) {
		String str = "Alice is a girl and shyam is a boy";
		Map<String,Integer> map = new HashMap<>();
		String[] words = str.split(" ");
		for(String word :words) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		System.out.println(map);
	}
}
