package oneToTen;

import java.util.Scanner;

public class SumInLoop {

	private static int ArraySum(int[] a)  {
		int summe = 0;
		for(int i = 0; i < a.length; i++)  {
			summe += a[i];
		}
		return summe;
	} // ArraySum Ende
	
	//------------------------------main-------------------------------	
	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		
		System.out.print("Menge: \n");
		int anzahl = eingabe.nextInt();
		
		int[] array = new int[anzahl];
		
		// Befüllen des Arrays
		for(int i = 0; i < anzahl; i++)  {
			System.out.print("input: ");
			array[i] = eingabe.nextInt();
		}
		
		System.out.println();
		System.out.println("answer: \n" + ArraySum(array));
		eingabe.close();
	}

}
