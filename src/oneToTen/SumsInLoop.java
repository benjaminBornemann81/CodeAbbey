package oneToTen;

import java.util.Scanner;

public class SumsInLoop {
	
	public static int[] SumArrays(int[] a, int[] b)  {
		int[] c = new int[a.length];
		
		for (int i = 0; i < a.length; i++)  {
			c[i] = a[i] + b[i];
		}
		
		return c;
	}
	
	public static String Ausgabe(int[] a)  {
		String ausgabe = "";
		for(int i = 0; i < a.length; i++)  {
			ausgabe += (a[i] + " ");
		}
		return ausgabe;
	}

	
	// -------------------- main ----------------------------------
	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		
		System.out.print("Menge: ");
		int anzahl = eingabe.nextInt();
		
		int[] arr1 = new int[anzahl];
		int[] arr2 = new int[anzahl];
		
		// Befüllen des ersten Feldes
		for (int i = 0; i < anzahl; i++)  {
			System.out.print("Eingabe arr1: ");
			arr1[i] = eingabe.nextInt();
		}
		
		// Befüllen des zweiten Feldes
		for (int i = 0; i < anzahl; i++)  {
			System.out.print("Eingabe arr2: ");
			arr2[i] = eingabe.nextInt();
		}
		
		
		// Berechnung
		int[] sum = SumArrays(arr1, arr2);
		
		// Ausgabe
		System.out.println(Ausgabe(sum));
		
		eingabe.close();
	}

}
