package elevenToTwenty;

import java.util.Random;

public class DiceRolling {

	static int anzahl = 6;
	
	static int RNG2Dice(double n)  {
		int wurf;
		wurf = (int)(n * 6);
		wurf += 1;
		return wurf;
	} // RNG2Dice Ende
	
	//--------------------------------main--------------------------------
	public static void main(String[] args) {
		// Eingabe
		double[] werte = new double[anzahl];
		for (int i = 0; i < werte.length; i++)  {
			werte[i] = new Random().nextDouble();
		}
		// Verarbeitung
		int[] result = new int[anzahl];
		for (int i = 0; i < anzahl; i++)  {
			result[i] = RNG2Dice(werte[i]);
		}
		// Ausgabe
		System.out.println(anzahl);
		for (double i : werte) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("answer: ");
		for (int i : result)  {
			System.out.print(i + " ");
		}
	} // main Ende

} // DiceRolling Ende
