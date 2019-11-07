package TwentyOneToThirty;

import elevenToTwenty.ArrayChecksum;

public class BubbleInArray {
	
	private static int swap = 0;
	
	public static int[] BubbleOnceArray(int[] arr)  {
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++)  {
			result[i] = arr[i];
 		}
		int temp = 0;
		
		for (int i=0; i < arr.length-1; i++)  {
			if (result[i] > result[i+1])  {
				temp = result[i+1];
				result[i+1] = result[i];
				result[i] = temp;
				swap += 1;
			}
		}
		return result;
	} //BubbleOnceArray Ende
	
	public static int BubbleSwapCount()  {
		return swap;
	} //BubbleSwapCountEnde
	
	//-------------------------------main---------------------------------------------
	public static void main(String[] args) {
		int[] werte = new int[] {1, 4, 3, 2, 6, 5};
		
		// Ausgabe	
		System.out.println("input data: ");
		for (int i: werte)  {
			System.out.print(i + " ");
		}
	
		int[] ergebnis = BubbleOnceArray(werte);
		System.out.println();
		System.out.println();
		System.out.println("answer: ");
		System.out.print(BubbleSwapCount() + " ");
		System.out.println(ArrayChecksum.Checksum(ergebnis));
		System.out.println();
	} // main Ende

} //BubbleInArray Ende
