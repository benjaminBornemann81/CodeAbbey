package elevenToTwenty;

public class Triangles {

	static int anzahl = 2;
	
	public static int IsTriangle(int a, int b, int c)  {
		int isTriangle = 0;
		if ((a+b >= c) && (b+c >= a) && (a+c >= b))  {
			isTriangle = 1;
		}
		return isTriangle;
	} // IsTriangle Ende
	
	//-----------------------------main---------------------------
	public static void main(String[] args) {
		int[] werte1 = new int[] {3, 4, 5};
		int[] werte2 = new int[] {1, 2, 4};
		
		//------------------------Ausgabe-------------------------
		System.out.println("data: ");
		System.out.println(anzahl);
		for (int zahl : werte1)  {
			System.out.print(zahl + " ");
		}
		System.out.println();
		for (int zahl : werte2)  {
			System.out.print(zahl + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("answer: ");
		System.out.print(IsTriangle(werte1[0], werte1[1], werte1[2]) + " " + IsTriangle(werte2[0], werte2[1], werte2[2]));
		
	} // main Ende

} // Triangles Ende
