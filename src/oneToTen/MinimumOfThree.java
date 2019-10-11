package oneToTen;

import java.util.Scanner;

public class MinimumOfThree {

	//----------Methode zum Bilden des Minimums----------
	public static int MinimumThree(int a, int b, int c)  {
		int min = a;
		
		if (b < a)  {
			min = b;
		} else {
			if (c < a)  {
				min = c;
			}
		}
		return min;
	}
	
	//-------------------main--------------------------	
	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		//---------------Initialisierung---------------
		System.out.print("Menge der Paare: ");
		int anzahl = eingabe.nextInt();
		int[] a = new int[anzahl];
		int[] b = new int[anzahl];
		int[] c = new int[anzahl];
		int[] d = new int[anzahl];
		
		
		//---------------Befüllen des Felder-------
		for (int i = 0; i < anzahl; i++)  {
			a[i] = eingabe.nextInt();
			b[i] = eingabe.nextInt();
			c[i] = eingabe.nextInt();
			}
		
		eingabe.close();
		
		//---------------Befüllen des Ergebnisses-----------
		
		for (int i = 0; i < anzahl; i++)  {
			d[i] = MinimumThree(a[i], b[i], c[i]);
		}
		
		
		//---------------Ausgabe------------------------
		System.out.println("answer:");
		for (int i = 0; i < anzahl; i++)  {
			System.out.print(d[i] + " ");
		}
		
		
	} //----------------main Ende-------------------

} //--------------------Klassenende-----------------
