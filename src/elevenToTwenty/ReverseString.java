package elevenToTwenty;

public class ReverseString {

	static String Revert(String str)   {
		String result = "";
		for (int i = str.length()-1; i >= 0; i--)  {
			result = result + "" + str.charAt(i);
		}
		return result;
	} // Revert Ende
	
	
	//---------------------------main--------------------------------
	public static void main(String[] args) {
		String str = "four score and seven years ago";
		System.out.println("input data: ");
		System.out.println(str);
		System.out.println();
		System.out.println("answer: ");
		System.out.println(Revert(str));
	} // main Ende

} // ReverseString Ende
