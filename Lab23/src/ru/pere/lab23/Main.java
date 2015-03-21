package ru.pere.lab23;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		Accumulator<String> acc1 = new Accumulator<String>("Start");
		acc1.Add(" Hola");
				
		Accumulator<Integer> acc2 = new Accumulator<Integer>(123);
		acc2.Add(137);
		out.printf("%s %d\n\n", acc1.getAcc(), acc2.getAcc());
		
		int i = -1;
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		out.print("������ ����� �� 0 �� 9: ");
			try {
				i = Integer.parseInt(reader.readLine());
				if (i<0 || i>9) throw new Exception ("noNumber");
			} catch (NumberFormatException e) {
				//e.printStackTrace();
				out.println("�� ����� �� �����? � ������ ��� ������");
			} catch (IOException e) {
				e.printStackTrace();
				out.println(e.getMessage());
			} catch (Exception e) {
				//e.printStackTrace();
				//out.println(e.getMessage());
				out.println("�� ����� �� �����, � �����");
			} finally {
				out.println("�����");
			}
		}
}
