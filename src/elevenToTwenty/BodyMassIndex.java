package elevenToTwenty;

import java.util.Scanner;

public class BodyMassIndex {

	static String BMI(double gewicht, double groesse)  {
		double bmi = (gewicht / (groesse * groesse));
		String bewertung;
		
		if (bmi < 18.5)  {
			bewertung = "under";		
		} else if (bmi < 25.0)  {
			bewertung = "normal";
		} else if (bmi < 30)  {
			bewertung = "over";
		}  else {
			bewertung = "obese";
		}
		return bewertung;
	} // BMI Ende
	
	
	//-----------------------main------------------------------------------
	public static void main(String[] args) {
		
		//-------------------------------Eingabe---------------------------
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Anzahl der Personen:");
		int anzahl = eingabe.nextInt();
		double[][] werte = new double[anzahl][2];
		
		for (int i = 0; i < anzahl; i++)  {
			System.out.println((i+1) + ". Person Gewicht: ");
			werte[i][0] = eingabe.nextInt();
			System.out.println((i+1) + ". Person Groesse: ");
			werte[i][1] = eingabe.nextDouble();
		}
		eingabe.close();
		
		//----------------------------Verarbeitung----------------------------------
		String[] ergebnis = new String[anzahl];
		for (int i = 0; i < anzahl; i++)  {
			ergebnis[i] = BMI(werte[i][0], werte[i][1]);
		}
		
		//----------------------------Ausgabe---------------------------------------
		for (String wert : ergebnis)  {
			System.out.print(wert + " ");
		}
	} // main Ende

} // BodyMassIndex Ende
