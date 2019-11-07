package oneToTen;

import java.util.Scanner;

public class SumsInLoop {
	
	public static int[] SumArrays(int[] a, int[] b)  {
		int[] c = new int[a.length];
		
		for (int i = 0; i < a.length; i++)  {
			c[i] = a[i] + b[i];
		}
		
		return c;
	} // SumArrays Ende
	
	public static String Ausgabe(int[] a)  {
		String ausgabe = "";
		for(int i = 0; i < a.length; i++)  {
			ausgabe += (a[i] + " ");
		}
		return ausgabe;
	} // Ausgabe Ende

	
	// -------------------- main ----------------------------------
	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		
		System.out.print("Menge: ");
		int anzahl = eingabe.nextInt();
		
		int[] arr1 = new int[anzahl];
		int[] arr2 = new int[anzahl];
		
		// Befüllen der Felder
		for (int i = 0; i < anzahl; i++)  {
			System.out.print("Eingabe arr1."+(i+1)+": ");
			arr1[i] = eingabe.nextInt();
			System.out.print("Eingabe arr2."+(i+1)+": ");
			arr2[i] = eingabe.nextInt();
		}
		
		// Berechnung
		int[] sum = SumArrays(arr1, arr2);
		
		// Ausgabe
		System.out.println();
		System.out.println("data: ");
		System.out.println(anzahl);
		for(int i = 0; i < anzahl; i++)  {
			System.out.println(arr1[i] + " " + arr2[i]);
		}
		
		System.out.println();
		System.out.println("answer: ");
		System.out.println(Ausgabe(sum));
		
		eingabe.close();
	}

}
