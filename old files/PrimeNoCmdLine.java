//  Write a Java program to check whether a number is prime or not using command
// line arguments.
// as it is a comand line argument we need to enter the value while interpreting
public class PrimeNoCmdLine {
    public static void main (String [] args ) {
        int n = Integer.parseInt(args[0]);
        int i = 1;
        int c = 0 ;
        for (i=1 ; i<= n ; i++) {
            if (n%i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println("Prime no") ;
        }
        else {
            System.out.println("Not Prime No");
        }
    }
}