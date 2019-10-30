package oneToTen;

public class VowelCount {
	
	static int zeilenZahl = 4;
	static String[] zeilen = new String[zeilenZahl]; 
		
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
		zeilen[0] = "abracadabra";
		zeilen[1] = "pear tree";
		zeilen[2] = "o a kak ushakov lil vo kashu kakao";
		zeilen[3] = "my pyx";
 				
		System.out.println("input data: ");
		System.out.println(zeilenZahl);
		
		for(String str : zeilen)  {
			System.out.println(str);
		}
		
		System.out.println();
		System.out.println("answer: ");
		for(String str : zeilen)  {
			System.out.print(CountVowels(str) + " ");
		}

	} // main Ende

} // VowelCount Ende
