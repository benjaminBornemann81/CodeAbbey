package elevenToTwenty;

import java.util.ArrayList;
import java.util.Collections;

public class WeightedSumOfDigits {

	static int WSD(int zahl)  {
		ArrayList<Integer> digits = new ArrayList<Integer>();
		int vorne = zahl, summe = 0;
		
		// Befüllen der Liste Ziffernweise von hinten nach vorne
		if (vorne >= 0)  {
			while(vorne > 0)  {
				digits.add(vorne % 10);
				vorne /= 10;
			}
			// Liste Umkehren
			Collections.reverse(digits);
			// Gewichtete Berechnung
			for (int i = 0; i < digits.size(); i++)  {
				summe += ((i+1) * digits.get(i));
			}
			return summe;
		} else {
			return 0; 
		}
	} // WSD Ende
	
	//---------------------------------main--------------------------------
	public static void main(String[] args) {
		int[] werte = new int[] {9, 15, 1776};
		int anzahl = werte.length;
		
		System.out.println("input data: ");
		System.out.println(anzahl);
		for (int i : werte)  {
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("answer: ");
		
		for (int i = 0; i < werte.length; i++)  {
			System.out.print(WSD(werte[i]) + " ");
		}
	} // main Ende

} // WeightedSumOfDigits Ende
