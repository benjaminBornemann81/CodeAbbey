package oneToTen;

public class VowelCount {
	
	static int CountVowels(String str)  {
		int count = 0;
		
		for (int i = 0; i < str.length(); i++)   {
			switch(str.charAt(i))  {
			case 'a':
				count += 1;
				break;
			case 'e':
				count += 1;
				break;
			case 'i':
				count += 1;
				break;
			case 'o':
				count += 1;
				break;
			case 'u':
				count += 1;
				break;
			case 'y':
				count += 1;
				break;
			}
		}
		return count;
	} // CountVowels Ende
	
	
	
	// -----------------------------main-------------------------
	public static void main(String[] args) {
		String[] werte = new String[] {"abracadabra", "pear tree", "o a kak ushakov lil vo kashu kakao", "my pyx"}; 
		int zeilenZahl = werte.length;
		
 				
		System.out.println("input data: ");
		System.out.println(zeilenZahl);
		
		for(String str : werte)  {
			System.out.println(str);
		}
		
		System.out.println();
		System.out.println("answer: ");
		for(String str : werte)  {
			System.out.print(CountVowels(str) + " ");
		}

	} // main Ende

} // VowelCount Ende
