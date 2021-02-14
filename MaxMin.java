//Write a Java program to find out the minimumand maximum number from a given array
//using for each loop.
import java.util.Scanner;
public class MaxMin {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n,max,min,i;
        System.out.println("enter the limit");
        n= sc.nextInt();
        int ar[] = new int [n] ;
        System.out.println("enter the elements");
        for(i=0;i<n;i++) {
            ar[i] = sc.nextInt();
        }
        max=min=ar[0];
        for(int element:ar) {
            if (element > max ) {
                max = element;
            }
            else if (element < min ) {
                min = element ;
            }
        }
        if (min==max) {
            System.out.println("nos are equal");
        }
        else {
        System.out.println("max is " +max);
        System.out.println("min is "+min);
        }
    }
}
/*
import java.util.Scanner;
public class MaxMin
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n,max,min,i;
		System.out.println("Enter limit");
		n=sc.nextInt();
		int ar[]=new int [n];
		System.out.println("enter elements");
		for(i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		max=min=ar[0];
		for(int el:ar)   //Using foreach loop 
		{
			if(el>max)
				max=el;
			else if(el<min)
				min=el;
			
		}
		System.out.println("Maximun: "+max);
		System.out.println("Minimun: "+min);

	}
}
*/