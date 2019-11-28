package thirtyOneToFourty;

import java.util.LinkedList;

public class NeumannsRandomGenerator {

	public static int RNGGen(int a)  {
		int result = 0;
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		result = a*a;
		System.out.println(a);
		result /= 100;
		System.out.println(a);
		result %= 10000;
		System.out.println(a);
		list.add(result);
		
		return result;
	} // RNGGen Ende
	
	public static String PruefeUndAuffuellen(String str)  {
		String result = str;
		while (result.length() < 8)  {
			result = " " + result;
		}
		
		return result;
	} //PruefeUndAuffuellen Ende
	
	
	//-------------------------main-----------------------------------
	public static void main(String[] args) {
		String[] werte = new String[] {"0001", "4100", "5761"};
		int anzahl = werte.length;
		
		System.out.println("input data: ");
		System.out.println(anzahl);
		for (String str : werte)  {
			System.out.print(str + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("answer: ");
		
		// Ausgabe
		for (String i : werte)  {
			System.out.print(RNGGen(Integer.parseInt(i)) + " ");
		}
		System.out.println();
		
		System.out.println("----------------------------");
		
		int a = 1;
		int result = a*a;
		System.out.println(a);
		result /= 100;
		System.out.println(a);
		result %= 10000;
		System.out.println(a);
		

	} // main Ende

} // NeumannsRandomGenerator Ende
