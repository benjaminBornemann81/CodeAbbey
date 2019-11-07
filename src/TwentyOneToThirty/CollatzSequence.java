package TwentyOneToThirty;

public class CollatzSequence {
	
	static int ColSeq(int zahl)  {
		int result = zahl, count = 0;
		while (result != 1)  {
			if ((result%2) == 0)   {
				result /= 2;
			} else  {
				result = 3*result + 1;
			}
			count++;
		}
		return count;
	} // ColSeq Ende
	
	//-------------------------main---------------------------
	public static void main(String[] args) {
		int[] werte = new int[] {2, 15, 97};
		int anzahl = werte.length;
		
		System.out.println("input data: ");
		System.out.println(anzahl);
		for (int i : werte)  {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("answer: ");
		for (int i : werte)  {
			System.out.print(ColSeq(i)+" ");
		}
	} // main Ende

} // CollatzSequence Ende
