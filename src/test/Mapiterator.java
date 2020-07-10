package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Mapiterator {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("1");
		strList.add("2");
		strList.add("4");
		System.out.println(strList);
		
		Map<String, String> map = new HashMap<>();
		map.put("0", "5");
		map.put("1", "2");
		map.put("2", "4");
		
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			String value = map.get(key);
			System.out.println(key + "," + value);
		}
		
		
	}
}
