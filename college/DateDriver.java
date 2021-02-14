package college;
import java.util.*;
public class DateDriver {
    public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the day1 : ");
		int day1 = input.nextInt();
		System.out.println("Enter the month1 : ");
		int month1 = input.nextInt();
		System.out.println("Enter the year1 : ");
		int year1 = input.nextInt();
		System.out.println("Enter the day2 : ");
		int day2 = input.nextInt();
		System.out.println("Enter the month2 : ");
		int month2 = input.nextInt();
		System.out.println("Enter the year2 : ");
		int year2 = input.nextInt();
		Date d1 = new Date(day1,month1,year1);
		Date d2 = new Date(day2,month2, year2);
		
		System.out.println("The Date you entered is....\nDate1 : "+d1.toString()+"\nDate2 : "+d2.toString());
		System.out.println("The Difference between two dates : "+d1.dateDifference(d1, d2)+" days.");
		
		if(d1.isEqual(d1, d2))
		{
			System.out.println("Two dates are equal....");
		}
		else {
			System.out.println("Two dates are not equal.....");
		}
		
		System.out.println("Now You will see a magic the date will be changed as per your command........");
		System.out.println("Your current date is : "+d1.toString());
		System.out.println("Press 1 for going ahead in the future or press other number to go in the past...");
		
		int ch = input.nextInt();
		System.out.println("Enter the number of days you want to go ahead or back...");
		int newDays = input.nextInt();
		d1.changeDate(newDays, ch);
		System.out.println("You are now in date : "+d1.toString());
		
		input.close();
	}
	
}
