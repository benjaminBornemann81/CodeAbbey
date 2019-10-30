package elevenToTwenty;

import java.util.ArrayList; 
import java.util.Collections;  
import java.util.Scanner;

public class MedianOfThree {
	
	static int MedianThree(int a, int b, int c)  {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(a);
		arrList.add(b);
		arrList.add(c);
		Collections.sort(arrList);
		int median = arrList.get(1);
		return median;
	} // MedianThree Ende
	
	//---------------------------main------------------------------
	public static void main(String[] args) {
		
		//-----------------------------Eingabe---------------------
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Menge der Tripel:");
		int anzahl = eingabe.nextInt();
		
		int[][] werte = new int[anzahl][3];
		
		for (int i = 0; i < anzahl; i++)  {
			System.out.print("Wert "+(i+1)+".1: ");
			werte[i][0] = eingabe.nextInt();
			System.out.print("Wert "+(i+1)+".2: ");
			werte[i][1] = eingabe.nextInt();
			System.out.print("Wert "+(i+1)+".3: ");
			werte[i][2] = eingabe.nextInt();
		}
		eingabe.close();
		
		int[] ergebnis = new int[anzahl];
		
		//--------------------Verarbeitung------------------------
		for (int i = 0; i < anzahl; i++)  {
			ergebnis[i] = MedianThree(werte[i][0], werte[i][1], werte[i][2]);
		}
		
		//--------------------Ausgabe-----------------------------
		System.out.println();
		System.out.println("answer: ");
		for (int zahl : ergebnis)  {
			System.out.print(zahl + " ");
		}
		
	} // main Ende

}
