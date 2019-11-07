package TwentyOneToThirty;

public class BubbleSort {

	static int pass = 0;
		
	public static int[] BubbleSortArray(int[] arr)  {
		int[] result = new int[arr.length]; 
		for (int i = 0; i < arr.length; i++)  {
			result[i] = arr[i];
		}
		int i = 0;
		do {
			i = BubbleInArray.BubbleSwapCount();
			result = BubbleInArray.BubbleOnceArray(result);
			pass += 1;
		} while (i != BubbleInArray.BubbleSwapCount());
		return result;
	} // BubbelSortArray Ende
	
	//----------------------------------------main------------------------------------------------------
	public static void main(String[] args) {
		// Eingabe
		int[] werte = new int[] {3, 1, 4, 1, 5, 9, 2, 6};
		int feldLaenge = werte.length;
		System.out.println("input data: ");
		System.out.println(feldLaenge);
		for (int i : werte)  {
			System.out.print(i + " ");
		}
		// Verarbeitung
		int[] sortiert = BubbleSortArray(werte);
		// Ausgabe 
		System.out.println();
		System.out.println();
		System.out.println("answer: ");
		System.out.print(pass + " ");
		System.out.println(BubbleInArray.BubbleSwapCount());
		
		
		System.out.println();
		System.out.println("Sortiertes Array:");		
			
		for (int i: sortiert)  {
			System.out.print(i + " ");
		}
		
	} // main Ende

} // BubbleSort Ende
