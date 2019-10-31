package elevenToTwenty;

import oneToTen.MaximumOfArray;

public class ArrayCounters {

	static int[] ArrayDigitCount(int[] arr)  {
		int n = MaximumOfArray.MaxOfArray(arr);
		int[] result = new int[n];
		for (int i = 0; i < arr.length; i++  ) {
			result[arr[i]-1] += 1;
		}
		return result;
	} // ArrayDigitCount Ende
	
	//---------------------------main-----------------------------------------------
	public static void main(String[] args) {
		int[] werte = new int[] {3, 2, 1, 2, 3, 1, 1, 1, 1, 3};
		
		// Ausgabe
		System.out.println("data input: ");
		System.out.print(werte.length + " ");
		System.out.println(MaximumOfArray.MaxOfArray(werte));
		for (int i : werte)  {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("answer: ");
		for (int i : (ArrayDigitCount(werte)))  {
			System.out.print(i + " ");
		}
	} // main Ende
} // ArrayCounters Ende
