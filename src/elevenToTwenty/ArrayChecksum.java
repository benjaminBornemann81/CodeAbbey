package elevenToTwenty;

public class ArrayChecksum {

	static int anzahl = 6;
	
	static long Checksum(int[] arr)  {
		long result = 0;
		for (int i = 0; i < arr.length; i++)  {
			result += arr[i];
			result *= 113;
			result %= 10000007;
		}
		return result;
	}// Checksum Ende
	
	//--------------------------------main---------------------------------
	public static void main(String[] args) {
		// Eingabge
		int[] werte = new int[] {3, 1, 4, 1, 5, 9};
		// Ausgabe
		System.out.println("input data: ");
		System.out.println(anzahl);
		for (int i : werte)  {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("answer: ");
		System.out.println(Checksum(werte));
	} // main Ende
} //ArrayChecksum Ende
