package oneToTen;

public class FahrenheitToCelsius {

	static int[] werte = new int[] {495, 353, 168, -39, 22};
	
	public static int FtoC (int f)  {
		int c = (f - 32) * 5/9;
		return c;
	}
	
	//------------------------------main---------------------------------
	public static void main(String[] args) {
		System.out.println("data: ");
		
		System.out.print(werte.length + " ");
		for(int zahl : werte)  {
			System.out.print(zahl + " ");
		}
		
		System.out.println();
		System.out.println("answer: ");
				
		for(int zahl : werte)  {
			System.out.print(FtoC(zahl) + " ");
		}

	} // main Ende

}