package TwentyOneToThirty;

public class GreatestCommonDivisor {

	public static int GCD(int a, int b)  {
		int gcd = 0;
		
		while (a != b)  {
			if (a < b)  {
				gcd = (b - a);
				b = a;
				a = gcd;
			} else {
				gcd = (a - b);
				a = b;
				b = gcd;
			}
		} 
		
		return gcd;
	} // GCD Ende
	
	public static int LCM(int a, int b)  {
		return a * b / GCD(a, b);
	} // LCM Ende
	
	
	//-------------------------------main-------------------------------------
	public static void main(String[] args) {
		int[][] werte = new int[][] {{2, 3}, {4, 10}};
		
		// Ausgabe
		System.out.println("input data: ");
		System.out.println(werte.length);
		for (int i = 0; i < werte.length; i++)  {
			System.out.println(werte[i][0] + " " + werte[i][1]);
		}
		System.out.println();
		System.out.println("answer: ");
		for (int i = 0; i < werte.length; i++)  {
			System.out.print("(" + GCD(werte[i][0], werte[i][1]) + " " + LCM(werte[i][0], werte[i][1])+ ") ");
		}
	} // main Ende

} // GreatesstCommonDivisor Ende
