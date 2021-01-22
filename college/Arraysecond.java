package college;
public class Arraysecond
{
	public static void main(String[] args) 
	{
		try
		{
    			try
			{
    		   		 int c[]={10};
    		   		 c[15]=89;
    			}
    		
    		catch(ArrayIndexOutOfBoundsException x)
		{
    		    throw x;//rethrows exception
    		}
    	    
	    }
	    catch(Exception x)
	    {
		    System.out.println("Array Index Out Of Bounds at:"+ x);
	    }
		finally
		{
		    System.out.println("finally all error solved");
		}
	}
}