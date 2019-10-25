package oneToTen;

import java.util.Scanner;

public class Rounding {

	public static int TeilenGanz(int a, int b)  {
		
		double quotient, rest, result;
		rest = a % b;
		quotient = a / b;
		
		if ((rest / b) < 0.5)  {
			result = quotient;
		} else {
			result = quotient +1;
		}
			
		return (int)result;
	} // Ende TeilenGanz
	
	
	
	
	// --------------------------main------------------------------
	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("input data: ");
		int anzahl = eingabe.nextInt();
		int[] ergebnis = new int[anzahl];
		
		for (int i = 0; i < anzahl; i++)  {
			int a = eingabe.nextInt();
			int b = eingabe.nextInt();
			ergebnis[i] = TeilenGanz(a, b);
		}
		
		eingabe.close();
		
		// ----------------Ausgabe---------------------------------
		System.out.println("answer:");
		for (int i = 0; i < anzahl; i++)  {
			System.out.print(ergebnis[i] + " ");
		}
		
	} // Ende main

}
