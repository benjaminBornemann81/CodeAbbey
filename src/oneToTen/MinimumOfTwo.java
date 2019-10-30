package oneToTen;

import java.util.Scanner;

public class MinimumOfTwo {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		
		//---------------Initialisierung---------------
		System.out.print("Menge der Paare: ");
		int anzahl = eingabe.nextInt();
		int[] a = new int[anzahl];
		int[] b = new int[anzahl];
		int[] c = new int[anzahl];
		
		
		//---------------Befüllen des Ergebnisses-------
		for (int i = 0; i < anzahl; i++)  {
			System.out.print("a" + (i+1) + ": ");
			a[i] = eingabe.nextInt();
			System.out.print("b" + (i+1) + ": ");
			b[i] = eingabe.nextInt();
			
			c[i] = Math.min(a[i], b[i]);
		}
		
		
		
		//---------------Ausgabe------------------------
		System.out.println("answer:");
		for (int i = 0; i < anzahl; i++)  {
			System.out.print(c[i] + " ");
		}
		
		eingabe.close();
	}

}
