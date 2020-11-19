import java.util.*;
class trycatch
{
	public static void main(String []args)
    {
		Scanner sc=new Scanner(System.in);
		int x=0,y=0;
		System.out.println("Enter a number");
		x=sc.nextInt();
		try
        {
		    y=10/x;
			System.out.println(y);
		}
		catch(Exception e)
        {
			System.out.println("Divide by Zero Error");
		}
		finally
        {
      	    System.out.println("The 'try catch' is finished.");
        }
    }
}