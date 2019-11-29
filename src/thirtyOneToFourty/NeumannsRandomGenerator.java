package thirtyOneToFourty;

import java.util.LinkedList;

public class NeumannsRandomGenerator {

	public static int RNGGen(int a)  {
		
		int zwischen = 88888;
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		while (!list.contains(zwischen)){
			zwischen = a*a;
			zwischen /= 100;
			zwischen %= 10000;
			list.add(zwischen);
		}
		return zwischen;
	} 
	
	public static String PruefeUndAuffuellen(int str)  {
		
		
		String result = Integer.toString(str);
		while (result.length() < 8)  {
			result = "0" + result;
		}
		
		return result;
	} 
	
	
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
//		for (String i : werte)  {
//			System.out.print(RNGGen(Integer.parseInt(i)) + " ");
//		}
		System.out.println();
		
		System.out.println("----------------------------");
		
		System.out.print(RNGGen(Integer.parseInt(werte[2])) + " ");
		
//		int a = Integer.parseInt(werte[0]);
//		int result = a*a;
//		System.out.println(a);
//		String bla = PruefeUndAuffuellen(result);
//		System.out.println(bla);
//		result /= 100;
//		System.out.println(a);
//		result %= 10000;
//		System.out.println(a);
		

	}

}
