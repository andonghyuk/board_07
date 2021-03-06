package test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMapTest {
	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("1", "4");
		map.put("2", "4");
		map.put("3", "4");
		map.put("4", "4");
		
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key);
		}
	}
}
