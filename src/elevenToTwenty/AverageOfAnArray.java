package elevenToTwenty;

import oneToTen.Rounding;

public class AverageOfAnArray {

	static int anzahl = 3;
	
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
		int[] arr1 = new int[] {2, 3, 7, 0};
		int[] arr2 = new int[] {20, 10, 0};
		int[] arr3 = new int[] {1, 0};
		
		System.out.println("input data: ");
		System.out.println(anzahl);
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : arr3) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("answer: ");
		System.out.print(ArrayAverage(arr1) + " ");
		System.out.print(ArrayAverage(arr2) + " ");
		System.out.print(ArrayAverage(arr3) + " ");
	}

}
