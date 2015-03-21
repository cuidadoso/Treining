package ru.pere.lab24;

import java.util.*;
import static java.lang.System.out;


public class Main {

	public static void main(String[] args) {
		
		List<String> array = new ArrayList<String>();
		
		array.add("Mike");
		array.add("Sam");
		array.add("Alejandro");
		
		Collections.sort(array);
		Object[] names = array.toArray();
		
		List l = new ArrayList(Arrays.asList(names));
		l.add("Anna");
		out.println("\nBefor sort");
		for (Object o : l){
			out.println(o);
		}
		Collections.sort(l);
		out.println("\nAfter sort");
		for (Object o : l){
			out.println(o);
		}
		
		out.println("\nIterator");
		Iterator<String> iterator = array.iterator();
		while(iterator.hasNext()){
			out.println(iterator.next());
		}
		out.println("\nObject");
		for (String o : array){
			out.println(o);
		}
		out.println("\nIndex");
		for (int i = 0; i < array.size(); i++){
			out.println(array.get(i));
		}
		out.println("\nIndex=1");
		out.println(array.get(1));
		
		Map<String, Integer> persons = new Hashtable<String, Integer>();
		
		persons.put("Alejandro", 19);
		persons.put("Julio", 2);
		persons.put("Diego", 36);
		
		out.println("\nHashtable by Map.Entry");
		for(Map.Entry<String, Integer> p : persons.entrySet()){
			
			out.printf("%s %d\n", p.getKey(), p.getValue());
		}
		out.println("\nHashtable by Key");
		for (String key : persons.keySet()){
			out.printf("%s %d\n", key, persons.get(key));
		}
		

	}

}
