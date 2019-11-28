package TwentyOneToThirty;

public class Palindromes {
	/* reviewed by Martin */
	
	/* Alte Lösung */
//	public static char CheckPalindrome(String str)  {
//		char result='Y';
//		String umgewandelt = str.replaceAll("[^A-Za-z]","").toLowerCase();
//		
//		while (umgewandelt.length() > 1)  {
//			if (umgewandelt.charAt(0) == umgewandelt.charAt(umgewandelt.length()-1))  {
//				umgewandelt = umgewandelt.substring(1, umgewandelt.length()-1);
//			} else {
//				result='N';
//				break;
//			}
//		}
//		return result;
	
	/* Neue Lösung */
	public static Boolean CheckPalindrome(String str)  {
		Boolean result=true;
		String umgewandelt = str.replaceAll("[^A-Za-z]","").toLowerCase();
		
		for (int i = 0; i < umgewandelt.length(); i++) {
			if (umgewandelt.charAt(i) != umgewandelt.charAt(umgewandelt.length()-i-1))  {
				return false;
			}
		}
		return result;
	}
	
	//-----------------------------main--------------------------------------
	public static void main(String[] args) {
		String[] werte = new String[] {"Stars", "O, a kak Uwakov lil vo kawu kakao!", "Some men interpret nine memos"};
		int anzahl = werte.length;
		
		System.out.println("input data: ");
		System.out.println(anzahl);
		for (int i = 0; i < werte.length; i++)  {
			System.out.println(werte[i]);
		}
		
		// Ausgabe
		System.out.println();
		System.out.println("answer: ");
		for (int i = 0; i < werte.length; i++)  {
			System.out.print((CheckPalindrome(werte[i])  ? "Y" : "N") + " ");
		}
	} 

} 
