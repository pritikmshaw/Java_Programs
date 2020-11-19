public class Array {
    public static void main(String[] args)
    { 
    try
    {
        int a[]={10};
        a[15]=32;
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("ArrayIndexOutOfBoundsat:"+e);
    }
    finally
    {
        System.out.println("finallyallerrorsolved");
    }
    }
}