package thirtyOneToFourty;

public class RotateString {

	public static String StringRotator(int n, String str)  {
		String result = str;
		
		if (n > 0)  {
			for (int i = 0; i < n; i++)  {
				char ch = result.charAt(0);
				result = result.substring(1);
				result += ch;
			} 
		}
		
		if (n < 0)  {
			for (int i = 0; i < (str.length()+n); i++)  {
				char ch = result.charAt(0);
				result = result.substring(1);
				result += ch;
			} 
		}
		return result;
	} // StringRotator Ende
	
	//--------------------------main---------------------------------------
	public static void main(String[] args) {
		String[][] werte = {{"3", "forwhomthebelltolls"}, {"-6", "verycomplexnumber"}};
		int anzahl = werte.length;
		
		System.out.println("input data: ");
		System.out.println(anzahl);
		
		for (int i = 0; i < werte.length; i++)  {
			for (int j = 0; j < werte[i].length; j++)  {
				System.out.print(werte[i][j] + " ");
			}
			System.out.println();
		}
		
		// Ausgabe
		System.out.println();
		System.out.println("answer: ");
				
		for (int i = 0; i < anzahl; i++)  {
			System.out.print(StringRotator(Integer.parseInt(werte[i][0]), werte[i][1]) + " ");
		}
	} // main Ende

} // RotateString Ende
