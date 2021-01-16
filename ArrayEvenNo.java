// even no in array
import java.util.Scanner;
public class ArrayEvenNo {
    public static void main(String[] args ){
        int a[] = new int [10];
        Scanner sc = new Scanner(System.in);
        int i=0;
        System.out.println("Enter the nos ");
        for (i=0; i<a.length;i++) {
            a[i]= sc.nextInt();
        }
        System.out.println(" Finding the even nos ");
        for(i=0;i<a.length;i++) {
            if ( a[i] % 2 == 0) {
                System.out.println( a[i] + " is a even no ");
            }
        }
    }
}