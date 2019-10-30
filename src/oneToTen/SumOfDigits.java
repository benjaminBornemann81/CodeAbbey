package oneToTen;

public class SumOfDigits {

	static int Quersumme(int zahl)  {
		int vorne = zahl, rest = 0;
		
		if (vorne >= 0)  {
			while(vorne > 0)  {
				rest += vorne % 10;
				vorne /= 10;
				}
			return rest;
		} else {
			return 0; 
		}
	} // Quersumme Ende
	
	static int MusterZahl(int[] arr)  {
		return arr[0]*arr[1]+arr[2];
	} // MusterZahl Ende
	
	
	
	//-----------------------------------main------------------------------
	public static void main(String[] args) {
		
		int[] arr1 = new int[] {11, 9, 1};
		int[] arr2 = new int[] {14, 90, 232};
		int[] arr3 = new int[] {111, 15, 111};
		
		System.out.println("input data: ");
		for(int a : arr1)  {
			System.out.print(a + " ");
		}
		System.out.println();
		for(int a : arr2)  {
			System.out.print(a + " ");
		}
		System.out.println();
		for(int a : arr3)  {
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.println();
		
		System.out.println("answer: ");
		System.out.print(Quersumme(MusterZahl(arr1)) + " ");
		System.out.print(Quersumme(MusterZahl(arr2)) + " ");
		System.out.print(Quersumme(MusterZahl(arr3)) + " ");

	} // main Ende

} // SumOfDigits Ende
