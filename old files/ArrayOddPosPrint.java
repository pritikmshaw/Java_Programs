// Finding the odd position nos  in array
import java.util.Scanner;
public class ArrayOddPosPrint {
    public static void main(String[] args ){
        int a[] = new int [10];
        Scanner sc = new Scanner(System.in);
        int i=0;
        System.out.println("Enter the nos ");
        for (i=0; i<a.length;i++) {
            a[i]= sc.nextInt();
        }
        System.out.println(" Finding the odd position nos  nos ");
        for(i=0;i<a.length;i++) {
            if ( i % 2 != 0) {
                System.out.println( a[i] + " is a odd position  no "+i );
            }
        }
    }
}