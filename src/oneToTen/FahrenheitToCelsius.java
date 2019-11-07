package oneToTen;

public class FahrenheitToCelsius {

	public static int FtoC (double f)  {
		double c = (f - 32) * 5/9;
		return Rounding.Runden(c);
	} // FtoC Ende
	
	//------------------------------main---------------------------------
	public static void main(String[] args) {
		int[] werte = new int[] {495, 353, 168, -39, 22};
		
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
