package ru.pere.Lab30;

import java.io.*;

import static java.lang.System.out;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		PersonInfo p = new PersonInfo("Alejandro Pere", 39);
		p.showInfo();
		
		File file = new File("PersonInfo.txt");
		if (!file.exists()) file.createNewFile();
		
		FileOutputStream fs = new FileOutputStream(file);
		ObjectOutputStream os = new ObjectOutputStream(fs);
		
		os.writeObject(p);
		
		os.close();
		fs.close();
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		out.println("**** Object reconstruction ****");
		
		PersonInfo restoredPersonInfo =	(PersonInfo)ois.readObject();
		restoredPersonInfo.showInfo();

	}

}
