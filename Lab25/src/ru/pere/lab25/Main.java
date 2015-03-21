package ru.pere.lab25;

import java.util.*;

import static java.lang.System.out;

public class Main {

	public static void main(String[] args) {
		
		Map<String, String> coll1 = new Hashtable<String, String>();
		Map<String, String> coll2 = new Hashtable<String, String>();
				
		coll1.put("key1", "value1");
		coll1.put("key2", "value2");
		coll1.put("key3", "value3");
		
		for (String key : coll1.keySet()){
			out.printf("%s - %s\n", key, coll1.get(key));
		}
		coll2=change(coll1);
		for (String key : coll2.keySet()){
			out.printf("%s - %s\n", key, coll2.get(key));
		}
	}
	
	public static Map<String, String> change(Map<String, String> coll){
		
		Map<String, String> coll2 = new Hashtable<String, String>();
		
		for (Map.Entry<String, String> c : coll.entrySet()){
			coll2.put(c.getValue(),c.getKey());
		}
		return coll2;
	}

}
