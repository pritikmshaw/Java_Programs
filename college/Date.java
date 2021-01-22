

package college;
public class Date {
	private int day;
	private int month;
	private int year;
	
	//Default constructor
	Date()
	{
		this.day = 01;
		this.month = 01;
		this.year = 1800;
	}
	
	//Parameterized constructor
	Date(int day, int month, int year)
	{
		if(month>=1 && month<=12 && year>0)
		{
			if(day <= noOfDays(month, year))
			{
				this.day = day;
				this.month = month;
				this.year = year;
			}
			else {
				System.out.println("Please Enter a valid date");
			}
			
		}
		else {
			System.out.println("Please enter a valid date........");
			System.exit(0);
		}
		
	}
	
	//accessor methods
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	
	//mutator methods
	public void setDay(int day)
	{
		if(day <= noOfDays(this.month, this.year))
		{
			this.day = day;
		}
		else {
			System.out.println("Please enter a valid day........");
			System.exit(0);
		}
	}
	public void setMonth(int month)
	{
		if(month>0 && month<=12)
		{
			this.month = month;
		}
		else {
			System.out.println("Please enter a valid month........");
			System.exit(0);
		}
		
	}
	public void setYear(int year)
	{
		if(year>=1)
		{
			this.year = year;	
		}
		else {
			System.out.println("Please enter a valid year........");
			System.exit(0);
		}
	}
	
	private boolean isLeapYear(int year)
	{
		if(year % 100 != 0 && year % 4 == 0 || year % 400 == 0)
		{
			return true;
		}
		return false;
	}
	
	private int noOfDays(int month, int year)
	{
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
		{
			return 31;
		}
		else if(month==2)
		{
			if(isLeapYear(year))
			{
				return 29;
			}
			return 28;
		}
		else {
			return 30;
		}
	}
	
	//Difference between two dates in days
	public int dateDifference(Date d1, Date d2)
	{
		int day1 = 0, day2 = 0, dayt = 0, yeart=0, i;
		if(d2.year == d1.year)
		{
			for(i=1;i<d2.month;i++)
			{
				day2 += noOfDays(i, d2.year);
			}
			day2 += d2.day;
			
			for(i=1;i<d1.month;i++)
			{
				day1 += noOfDays(i, d1.year);
			}
			day1 += d1.day;
			dayt = day2 - day1;
		}
		else
		{
			yeart = isLeapYear(d1.year) ? 366 : 365;
			for(i=1;i<d1.month;i++)
			{
				day1 += noOfDays(i, d1.year);
			}
			day1 += d1.day;
			dayt = year-day1;
			yeart = 0;
			
			for(i=d1.year+1;i<d2.year;i++)
			{
				yeart += isLeapYear(i) ? 366 : 365;
			}
			dayt += yeart;
			
			for(i=1;i<d2.month;i++)
			{
				day2 += noOfDays(i, d2.year);
			}
			day2 += d2.day;
			dayt += day2;
		}
		return dayt;
	}
	
	public String toString()
	{
		return day+"/"+month+"/"+year;
	}
	
	//Checking whether two dates are equal
	public boolean isEqual(Date d1, Date d2)
	{
		if(d1.day==d2.day && d1.month==d2.month && d1.year==d2.year)
		{
			return true;
		}
		return false;
	}
	
	//Adding or subtracting any number of days
	public void changeDate(int day, int choice)
	{
		if(choice==1)
		{
			for(int i=1;i<=day;i++)
			{
				if(this.day + 1 <= noOfDays(this.month, this.year))
				{
					this.day += 1;
				}
				else {
					if(this.month<12)
					{
						this.month += 1;
						this.day = 1;
					}
					else {
						this.year += 1;
						this.month = 1;
						this.day = 1;
					}
				}
			}
		}
		else {
			for(int i=1;i<=day;i++)
			{
				if(this.day - 1 >= 1)
				{
					this.day -= 1;
				}
				else {
					if(this.month>1)
					{
						this.month -= 1;
						this.day = noOfDays(this.month, this.year);
					}
					else {
						this.year -= 1;
						this.month = 12;
						this.day = 31;
					}
				}
			}
		}
		
	}

}

