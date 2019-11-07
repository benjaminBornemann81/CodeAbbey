package elevenToTwenty;

public class Triangles {

	public static int IsTriangle(int a, int b, int c)  {
		int isTriangle = 0;
		if ((a+b >= c) && (b+c >= a) && (a+c >= b))  {
			isTriangle = 1;
		}
		return isTriangle;
	} // IsTriangle Ende
	
	//-----------------------------main---------------------------
	public static void main(String[] args) {
		int[][] werte = new int[][] {{3, 4, 5}, {1, 2, 4}};
		int anzahl = werte.length;
		
		//------------------------Ausgabe-------------------------
		System.out.println("data: ");
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
			System.out.print(IsTriangle(werte[i][0], werte[i][1],werte[i][2]) + " ");
		}
		
	} // main Ende

} // Triangles Ende
