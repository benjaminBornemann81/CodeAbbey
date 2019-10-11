package oneToTen;

public class MaximumOfArray {

	public static int MaxOfArray(int[] arr)  {
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++)  {
			if (arr[i] > max)  {
				max = arr[i];
			}
		}
		return max;
	} //-------------------MaxOfArray Ende----------------------
	
	public static int MinOfArray(int[] arr)  {
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++)  {
			if (arr[i] < min)  {
				min = arr[i];
			}
		}
		return min;
	} //-------------------MinOfArray Ende----------------------
	
	
	  //-------------------main---------------------------------
	public static void main(String[] args) {
		
		//--------Befüllen des Arrays mit den Eingabewerten-------
		
		int[] array = new int[300];
		
		//----------Aufsteigende Eingabewerte------------------
		for (int i = 0; i < array.length/2; i++)  {
			array[i] = i*2 + 1;
		}
		
		
		//----------Absteigende Eingabewerte-------------------
		for (int i = 0; i < array.length/2; i++)  {
			array[i+array.length/2] = array.length - 2*i;
		}
		
		//-----------------------------------------------------------
		
		//---------------------Ausgabe Testwerte zur Kontrolle---------------------
		for (int i = 0; i < array.length; i++)  {
			System.out.println(array[i]);
		}
		
		//---------------Methodenaufrufe------------------------------
		
		int max = MaxOfArray(array);
		int min = MinOfArray(array);
		
		//---------------Ausgabe----------------------------------------
		
		System.out.println("answer:");
		System.out.print(max);
		System.out.print(" ");
		System.out.print(min);
	} //-----------------main Ende-------------------------------------

}
