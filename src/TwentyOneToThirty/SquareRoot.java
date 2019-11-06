package TwentyOneToThirty;

public class SquareRoot {

	public static int SquareRT(int a, int b)  {
		int sqrt = 0;
		
		
		return sqrt;
	}
	
	
	//------------------------------main------------------------------------
	public static void main(String[] args) {
		int[][] werte = new int[][] {{150, 0}, {5, 1}, {10, 3}};
		int anzahl = werte.length;
		
		System.out.println("input data: ");
		System.out.println(anzahl);
		for (int i = 0; i < anzahl; i++)  {
			System.out.println(werte[i][0] + " " + werte[i][1]);
		}
		
		System.out.println();
		System.out.println("answer: ");
		
		for (int i = 0; i < anzahl; i++)  {
			System.out.print(SquareRT(werte[i][0], werte[i][1]) + " ");
		}
		
	} // main Ende

} // TwentyOneToThirty
