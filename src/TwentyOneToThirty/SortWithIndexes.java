package TwentyOneToThirty;

public class SortWithIndexes {

	public static String SortWithIndex(int[] arr)  {
		String result="";
		
		int[] alt = new int[arr.length];
		for (int i = 0; i < arr.length; i++)  {
			alt[i] = arr[i];
		}
		
		int[] neu = BubbleSort.BubbleSortArray(alt);
		
		for (int i = 0; i < alt.length; i++)  {
			for	(int j = 0; j <alt.length; j++)  {
				if (neu[i] == alt[j])  {
					result += j+1 + " ";
				}
			}
		} // for Ende
		return result;
	} //SortWithIndex Ende
	
	//-------------------------------------main------------------------------------
	public static void main(String[] args) {
		int[] werte = new int[] {50, 98, 17, 79};
		
		System.out.println("input data: ");
		System.out.println(werte.length);
		for (int i : werte)   {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("answer: ");
		
		System.out.println(SortWithIndex(werte));
	} // main Ende

} // TwentyOneToThirty Ende
