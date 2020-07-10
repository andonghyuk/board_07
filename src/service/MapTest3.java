package service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest3 {
	public static void main(String[] args)	{
		Map<String,Object> map = new HashMap<>();
		map.put("name","밥");
		map.put("class","A");
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext())	{
			String key = it.next();
			System.out.println(key);
		}
		
		
	}

}
