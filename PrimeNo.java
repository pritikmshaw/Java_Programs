import java.util.*;
public class PrimeNo {
    public static void main(String [] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        
        int i , c=0;
        for (i = 1 ; i <= n ; i++) {
            if( n%i == 0) 
                c++;
        }
        if(c==2)  {
            System.out.println("Prime number");
        }
        else {
            System.out.println("not a prime no");
        }
    }
}