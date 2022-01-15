// Write a java program to find the factorial 
import java.util.Scanner;
public class Factorial {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int range ;
        System.out.println("enter the range ");
        range = sc.nextInt();
        int fact = 1 ;
        int i;
        for (i=1; i<= range;i++) {
            fact = fact * i ;
        }
        System.out.println("factorial is " + fact);
    }
}