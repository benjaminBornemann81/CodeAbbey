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
		int[][] werte = {{1, 0, 0, 0, 2, 3, 4, 5}, {5, 3, 23, 22, 24, 4, 20, 45}, {8, 4, 6, 47, 9, 11, 51, 13}};
		int anzahl = werte.length;
		
		System.out.println("input data: ");
		System.out.println(anzahl);
		
		for (int i = 0; i < werte.length; i++)  {
			for (int j = 0; j < werte[i].length; j++)  {
				System.out.print(werte[i][j] + " ");
			}
			System.out.println();
		}
		
		// Ausgabe
		System.out.println();
		System.out.println("answer: ");
		for (int i = 0; i < werte.length; i++)  {
			System.out.print(DateDiff(werte[i][0], werte[i][1], werte[i][2], werte[i][3], werte[i][4], werte[i][5], werte[i][6], werte[i][7])+" ");
		}
	} // main Ende

} // ModuloAndTimeDifference Ende
