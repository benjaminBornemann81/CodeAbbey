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
		int[] werte1 = new int[] {0, 0, 1, 1};
		int[] werte2 = new int[] {1, 0, 0, 1};
		
		System.out.println("input data:");
		for (int i : werte1)  {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i : werte2)  {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("answer: ");
 		System.out.print(BaueFunktion(werte1[0], werte1[1], werte1[2], werte1[3])+" ");
 		System.out.print(BaueFunktion(werte2[0], werte2[1], werte2[2], werte2[3]));
	} // main Ende

} // LinearFunction Ende
