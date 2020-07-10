package service;

import java.util.*;

public class Test {
	public static void main (String[] args)	{
		List<String> strList = new ArrayList<>();
		strList.add("가");
		strList.add("나");
		strList.add("다");
		strList.add("라");
		System.out.println(strList);
		
		Map<String,String> map = new HashMap<>();
		map.put("가가", "바바");
		map.put("나가", "홀드");
		map.put("가다", "롱");
		map.put("가라", "숏");
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext())	{
			String key = keys.next();
			String value = map.get(key);
			System.out.println(key + ","+value);
		}
		
		
		
	}
}
