package TwentyOneToThirty;

public class BubbleSort {

	static int feldLaenge = 8;
	
	static int[] BubSort(int[] arr)  {
		int[] result = arr;
		int swap = 0;
		
		for (int i = 0; i < feldLaenge-1; i++)  {
			if (arr[i] > arr[i+1])  {
				int t = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = t;
				swap += 1;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
