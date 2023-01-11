import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.lang.Math;

public class dayTracker {
	
	 public static LocalDate myObj = LocalDate.now();
	 public static DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy");
	 
	
	
	public static String convertPeriodToString(Period period) {
		String answer = "There are " + Math.abs(period.getYears()) + " years, " + Math.abs(period.getMonths()) + " months, and " + Math.abs(period.getDays()) + " days until this date!";
		return answer;
	}
	

	
	
	public static void main(String[] args) {
		System.out.println("What is today's date? ");
		System.out.println("Today's date is: " + myObj.format(myFormatObj));
		System.out.println("---------------------");
		System.out.println("What was yesterday's date?");
		System.out.println("Yesterday's date was: " + myObj.minusDays(1).format(myFormatObj));
		System.out.println("---------------------");
		System.out.println("What was the date 25 days ago?");
		System.out.println("25 days ago it was: " + myObj.minusDays(25).format(myFormatObj));
		System.out.println("---------------------");
		System.out.println("Is there a date you want to track? (Format MM-dd-yyyy)");
			Scanner input = new Scanner(System.in);
			String date = input.nextLine();	 
			LocalDate localDateTest = LocalDate.parse(date, myFormatObj);
		System.out.println(convertPeriodToString(localDateTest.until(myObj)));
		System.out.println("---------------------");
		System.out.println("Thank you for using this program!");
	
		
	}

}
