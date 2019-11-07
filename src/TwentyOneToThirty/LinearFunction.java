package TwentyOneToThirty;

public class LinearFunction {

	static String BaueFunktion(int x1, int y1, int x2, int y2)  {
		// Koordinaten nach x aufsteigend sortieren
		if (x2 < x1)  {
			int hilf = x1;
			x1 = x2;
			x2 = hilf;
			hilf = y1;
			y1= y2;
			y2 = hilf;
		}
		// Berechnung der Funktion
		int a = (y2 - y1);
		int b = y1;
		String result = "("+a+" "+b+")";
		
		return result;
	} // BaueFunktion Ende
	
	//--------------------------main------------------------------------
	public static void main(String[] args) {
		// Eingabe
		int[][] werte = new int[][] {{0, 0, 1, 1}, {1, 0, 0, 1}};
		int anzahl = werte.length;
		
		System.out.println("input data:");
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
			System.out.print(BaueFunktion(werte[i][0], werte[i][1], werte[i][2], werte[i][3])+" ");
		}
	} // main Ende

} // LinearFunction Ende
