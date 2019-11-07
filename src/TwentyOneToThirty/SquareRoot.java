package TwentyOneToThirty;

public class SquareRoot {

	public static double SquareRT(int a, int b)  {
		
		double r = 1;
		double d = 0;
		
		for (int i = 0; i < b; i++)  {
			d = a / r;
			r = (d + r) / 2;	 
		}
		return r;
	} // SquareRT Ende
	
	
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
