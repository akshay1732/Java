package com.Java.basics;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateandTime {

	public static void main(String[] args) {
		
		long a=0;
		 // Instantiate a Date object
	      Date date = new Date();
	      
	      a=date.getTime();
	      System.out.println(a);

	      // display time and date 
	      System.out.println(date);
	      
	  	  // display time and date with Printf formatting
	      System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
	      
	      System.out.println("");
	      
	      System.out.printf("%s %tB %<td, %<tY", "Due date:", date);
	      
	      //SimpleDateFormat Formatting
	      Date dNow = new Date( );
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("E D F dd.MM.yyyy 'at' HH:mm:ss zzz");

	      System.out.println("\nCurrent Date: " + ft.format(dNow));
	      
	      
	      //Parsing a date
	      
	      SimpleDateFormat ft2 = new SimpleDateFormat ("yyyy-MM-dd"); 
	      String input =  "1818-11-11";
	      try {
			Date t = ft2.parse(input);
			System.out.println(t);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      
	      //Find Difference in two dates
	      
	      LocalDate now = LocalDate.now();
	      LocalDateTime now2= LocalDateTime.now();
	      LocalDate sixDaysBehind = now.minusDays(6);
	      LocalDateTime sixDaysBehind2 = now2.plusDays(5);
	      
	      Period period = Period.between(now, sixDaysBehind);   
	      int diff = period.getDays();
	      System.out.println(diff);
	      
	      Duration d1=Duration.between(now2, sixDaysBehind2);
	      long d2=d1.toHours();
	      System.out.println(d2);
	      
	      long diff2 = ChronoUnit.DAYS.between(now2, sixDaysBehind2);
	      System.out.println(diff2);
	      
	      
	}

}


//SimpleDateFormat

//Character	Description					Example
/*
 * G 		Era designator 				AD 
 * y 		Year in four digits 		2001 
 * M	 	Month in year 				July or 07 
 * d 		Day in month 				10 
 * h 		Hour in A.M./P.M. (1~12) 	12 
 * H 		Hour in day (0~23) 			22 
 * m		Minute in hour 				30 
 * s 		Second in minute 			55 
 * S 		Millisecond 				234 
 * E 		Day in week					Tuesday 
 * D 		Day in year 				360 
 * F 		Day of week in month 		2 (second Wed. in July) 
 * w 		Week in year 				40 
 * W 		Week in month 				1 
 * a 		A.M./P.M. marker 			PM 
 * k 		Hour in day (1~24)			24 
 * K 		Hour in A.M./P.M. (0~11) 	10 
 * z 		Time zone 					Eastern Standard Time 
 * ' 		Escape for text 			Delimiter 
 * " 		Single quote 				`
 */



//Printf formating


//Character		Description										Example
//c				Complete date and time							Mon May 04 09:51:52 CDT 2009
//F				ISO 8601 date									2004-02-09
//D				U.S. formatted date (month/day/year)			02/09/2004
//T				24-hour time									18:05:19
//r				12-hour time									06:05:19 pm
//R				24-hour time, no seconds						18:05
//Y				Four-digit year (with leading zeroes)			2004

//y				Last two digits of the year 					04
				//(with leading zeroes)	

//C				First two digits of the year 					20
				//(with leading zeroes)	

//B				Full month name									February
//b				Abbreviated month name							Feb
//m				Two-digit month (with leading zeroes)			02
//d				Two-digit day (with leading zeroes)				03
//e				Two-digit day (without leading zeroes)			9
//A				Full weekday name								Monday
//a				Abbreviated weekday name						Mon
//j				Three-digit day of year 						069
//H				Two-digit hour , between 00 and 23				08
//k				Two-digit hour , between 0 and 23				8
//I				Two-digit hour , between 01 and 12				06
//l				Two-digit hour , between 1 and 12				6
//M				Two-digit minutes 								05
//S				Two-digit seconds 								19
//L				Three-digit milliseconds 						047
//N				Nine-digit nanoseconds 							047000000
//P				Uppercase morning or afternoon marker			PM
//p				Lowercase morning or afternoon marker			pm
//z				RFC 822 numeric offset from GMT					-0800
//Z				Time zone										PST
//s				Seconds since 1970-01-01 00:00:00 GMT			1078884319
//Q				Milliseconds since 1970-01-01 00:00:00 GMT		1078884319047