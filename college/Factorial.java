import java.util.*;
public class Factorial {  // class name should be similar to the file name 
     public static void main( String[] args) {  //method decleared 

        Scanner sc = new Scanner(System.in);  //object should be created to take input
        int fact = 1;
        System.out.println("enter a number");
        int n = sc.nextInt();     // taking input 
        // factorial logic
        for( int i = 1 ; i<=n ; i++) {
            fact = fact * i ;
        }
        System.out.println(fact);

        // object should be closed to avoid error in object creation
        sc.close();
    }
    
}