package elevenToTwenty;

import java.util.Scanner;

public class ArithmeticProgression {
	
	static int AnzahlTestfälle = 2;
	Scanner Eingabe = new Scanner(System.in);
	
	static int FolgenSumme(int a, int b, int n)  {
		int summe = 0;
		int start = a;
		for (int i = 0; i < n; i++)  {
			summe += (start + b);
		}
		return summe;
	} // FolgenSumme Ende
	
	
	public static void main(String[] args) {
		
		System.out.println("answer:");
		System.out.print(FolgenSumme(5, 2, 3) + " ");
		System.out.println(FolgenSumme(3, 0, 10));
	}

}
