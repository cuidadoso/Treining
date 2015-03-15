package ru.pere.lab16;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		String name;
		out.println("Ведите список имен. Закончите ввод пустым именем.");
		do{
			name = reader.readLine();
			if (!name.isEmpty()) list.add(name);
		} while(!name.isEmpty());
		out.println(" -=Not Sorted=- ");
		for (int i=0; i<list.size(); i++){
			out.println(list.get(i));
		}
		Object[] m = list.toArray();
		Arrays.sort(m);
		List listSorted = Arrays.asList(m);
		out.println(" -=Sorted=- ");
		for (Object nm : listSorted){
			out.println(nm);
		}
		

	}

}
