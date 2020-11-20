import java.util.*;
import java.util.InputMismatchException;

public class MismatchException {
	
	public static String validName(String name) throws InputMismatchException{
		if(name.matches("^[a-zA-Z]*$"))
		{
			return name;
		}
		throw new InputMismatchException("You entered an invalid name. Check your name once again and then enter");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String s = sc.next();
		try {
			String news = validName(s);
			System.out.println("You entered : " + news);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		finally {
			sc.close();
		}

	}

}
