package elevenToTwenty;

import oneToTen.Rounding;

public class AverageOfAnArray {

	static int ArrayAverage(int[] arr)  {
		int summe = 0, i = 0, stellenZahl = 0;
		while(arr[i] != 0)  {
			stellenZahl += 1;
			summe += arr[i];
			i++;
		}
		
		return Rounding.Runden(summe/stellenZahl);
	}  // ArrayAverage Ende
	
	//------------------------------main--------------------------
	public static void main(String[] args) {
		int[][] werte = new int[][] {{2, 3, 7, 0}, {20, 10, 0}, {1, 0}};
		int anzahl = werte.length;
		
		System.out.println("input data: ");
		System.out.println(anzahl);
		
		for (int i = 0; i < werte.length; i++)  {
			for (int j = 0; j < werte[i].length; j++)  {
				System.out.print(werte[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("answer: ");

		for (int i = 0; i < werte.length; i++)  {
			System.out.print(ArrayAverage(werte[i]) + " ");
		}
	} // main Ende

} // AverageOfAnArray Ende
