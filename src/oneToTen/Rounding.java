package oneToTen;

import java.util.Scanner;

public class Rounding {

	public static int TeilenUndRunden(double a, double b)  {
		double div = a / b;
		return Runden(div);
	} // TeilenUndRunden Ende
	
	public static int Runden(double zahl)  {
		double ergebnis = 0;
		double rest = zahl % 1;
		if (rest < 0.5)  {
			ergebnis = Math.floor(zahl);
		}  else  {
			ergebnis = Math.ceil(zahl);
		}
		return (int)ergebnis;
	} // Runden Ende
	
	
	// --------------------------main------------------------------
	public static void main(String[] args) {
		
		//--------------------Eingabe---------------------------
		Scanner eingabe = new Scanner(System.in);
		System.out.println("input data: ");
		System.out.println("Anzahl: ");
		int anzahl = eingabe.nextInt();
		int[] ergebnis = new int[anzahl];
		double[] a = new double[anzahl];
		double[] b = new double[anzahl];
				
		for (int i = 0; i < anzahl; i++)  {
			System.out.println("a" + (i+1) + ": ");
			a[i] = eingabe.nextInt();
			System.out.println("b" + (i+1) + ": ");
			b[i] = eingabe.nextInt();
			ergebnis[i] = TeilenUndRunden(a[i], b[i]);
		}
		
		eingabe.close();
		
		// ----------------Ausgabe---------------------------------
		System.out.println("answer:");
		for (int i : ergebnis)  {
			System.out.print(i + " ");
		}
		
	} // Ende main

}
