package TwentyOneToThirty;

public class ModuloAndTimeDifference {

	static int anzahl = 3;
	
	static String DateDiff(int day1, int hour1, int min1, int sec1, int day2, int hour2, int min2, int sec2)  {
		String result = "";
		int date1Seconds = sec1 + min1*60 + hour1*3600 + day1*24*3600;
		int date2Seconds = sec2 + min2*60 + hour2*3600 + day2*24*3600;
		int secondsDiff = date2Seconds - date1Seconds;
		
		int daysResult = secondsDiff/(24*3600);
		int hoursResult = (secondsDiff/3600)%24;
		int minutesResult = (secondsDiff/60)%60;
		int secondsResult = secondsDiff%60;
		
		result = "("+daysResult+" "+hoursResult+" "+minutesResult+" "+secondsResult+")";
		
		return result;
	} // DateDiff Ende
	
	
	//-------------------------------main---------------------------
	public static void main(String[] args) {
		System.out.println("answer: ");
		
		System.out.print(DateDiff(1, 0, 0, 0, 2, 3, 4, 5)+" ");
		System.out.print(DateDiff(5, 3, 23, 22, 24, 4, 20, 45)+" ");
		System.out.print(DateDiff(8, 4, 6, 47, 9, 11, 51, 13));
	} // main Ende

} // ModuloAndTimeDifference Ende
