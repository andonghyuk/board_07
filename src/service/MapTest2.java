package service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args)	{
		
	
	/*
	 * name : 애쉬
	 * power : 30
	 * defence : 50
	 * level : 10
	 * speed : 300
	 */

	
	
	Map<String,Object> m = new HashMap<>();
	m.put("name","애쉬");
	m.put("power",30);
	m.put("defence", 50);
	m.put("level",10);
	m.put("speed", 300);
	Iterator<String> it = m.keySet().iterator();
	while(it.hasNext())	{
		String key = it.next();
		System.out.println(key +" : "+ m.get(key));
		
		
		
		
	}
	
	}
	
	

	}
