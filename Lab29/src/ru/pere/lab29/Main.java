package ru.pere.lab29;

import java.util.*;
import java.text.*;
import java.io.*;

import static java.lang.System.out;

public class Main {
	
	enum Color {
		красный, зеленый, синий;

		@Override
		public String toString() {
			return String.format("Цвет: %s", super.toString());
		}
		
		private Color() {
			
			
			
		}
		
		public String translate(){
			if (this.equals(Color.красный)){
				return "red";
			}
			if (this.equals(Color.зеленый)){
				return "green";
			}
			if (this.equals(Color.синий)){
				return "blue";
			}
			return "";
		}
		
	};
	enum Weekdays { Воскресенье, Понедельник, Вторник, Среда, Четверг, Пятница, Суббота };

	public static void main(String[] args) throws IOException, ParseException {
		
		Color color = Color.зеленый, secondColor = color;
		out.println(color);
		out.println(color.ordinal());
		out.println(color.name());
		for (Color c : color.values()) out.println(c);
		Color c1 = Color.valueOf("красный");
		out.println(c1);
		out.println(color.translate());
		
		Date now = new Date();
		
		Weekdays w = Weekdays.values()[now.getDay()];
		out.println(w);
		String date = "1975/12/01";
		Date bd = new Date(Date.parse(date));
		bd.setYear(now.getYear());
		if (bd.after(now)) out.println("Birthday is in future");
		out.println(bd.toLocaleString());
		
		Calendar cal = Calendar.getInstance();
		out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		cal.set(Calendar.YEAR, 2015);
		cal.set(Calendar.MONTH, 3);
		cal.set(Calendar.DAY_OF_MONTH, 23);
		
		DateFormat sdf = DateFormat.getDateInstance(DateFormat.LONG, new Locale("ru", "RF"));
		out.println(sdf.format(cal.getTime()));

		DateFormat sdf2 = DateFormat.getTimeInstance(DateFormat.SHORT, new Locale("ru", "RF"));
		out.println(sdf2.format(cal.getTime()));

		DateFormat sdf3 = DateFormat.getTimeInstance(DateFormat.LONG, new Locale("en", "US"));
		out.println(sdf3.format(cal.getTime()));

		//----------------======================================-------------------		
		
		out.println("**************************************");
		out.print("Введиете дату своего родждения: ");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Calendar cal2 = Calendar.getInstance();
		DateFormat sdf4 = DateFormat.getDateInstance();
				//DateFormat.SHORT, new Locale("ru", "RF"));
		
		Date b = sdf4.parse(reader.readLine());
		cal2.setTime(b);

		//=============================================================
		//String s = reader.readLine();
		//String[] sm = s.split("/");
		//cal2.set(Calendar.YEAR, Integer.parseInt(sm[2]));
		//cal2.set(Calendar.MONTH, Integer.parseInt(sm[1])-1);
		//cal2.set(Calendar.DAY_OF_MONTH, Integer.parseInt(sm[0]));
		//=============================================================
		
		out.printf("Дата рождения %s  - ", sdf4.format(cal2.getTime()));
		out.printf("%s\n", Weekdays.values()[cal2.get(Calendar.DAY_OF_WEEK)-1]);
		cal2.add(Calendar.YEAR, 100);
		out.printf("100 лет Вам будее %s  - ", sdf4.format(cal2.getTime()));
		out.printf("%s\n", Weekdays.values()[cal2.get(Calendar.DAY_OF_WEEK)-1]);
		String s = String.format("%1$tY.%1$tm.%1$td %1$tA", cal2);
		out.print(s);
	}

}
