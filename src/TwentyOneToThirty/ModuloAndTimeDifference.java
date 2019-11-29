package TwentyOneToThirty;

import java.text.SimpleDateFormat;
import java.util.Date;

/* reviewed by Martin */

public class ModuloAndTimeDifference {

	/* alte Lösung*/
//	static String DateDiff(int day1, int hour1, int min1, int sec1, int day2, int hour2, int min2, int sec2)  {
//		String result = "";
//		int date1Seconds = sec1 + min1*60 + hour1*3600 + day1*24*3600;
//		int date2Seconds = sec2 + min2*60 + hour2*3600 + day2*24*3600;
//		int secondsDiff = date2Seconds - date1Seconds;
//		
//		int daysResult = secondsDiff/(24*3600);
//		int hoursResult = (secondsDiff/3600)%24;
//		int minutesResult = (secondsDiff/60)%60;
//		int secondsResult = secondsDiff%60;
//		
//		result = "("+daysResult+" "+hoursResult+" "+minutesResult+" "+secondsResult+")";
//		
//		return result;
//	}
	
	/* neue Lösung */ 
	
	
	
	
	
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
		
		/* Ausgabe */
		System.out.println();
		System.out.println("answer: ");
		
		String sDate1="31/12/1998";
		Date date1 = new Date();
		
		try {
			date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		} catch(Exception e)  {
			System.out.println("kaputt");
		}
		
		System.out.println(date1);
		
	} 

} 
