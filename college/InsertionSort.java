import java.util.*;
public class InsertionSort {
    static int a[] ;
    static int n ;
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of elements you want to insert");

        n = sc.nextInt();
        a = new int[n];
        for(int i=0; i<n ; i++) {
            System.out.println(" Enter numbers " );
            a[i] = sc.nextInt();
        }
        InsertionSort ii = new InsertionSort();
        ii.insertionsort(a,n);
        System.out.println("All elements are ");

        for(int i=0; i<n ; i++) {
            System.out.println(a[i]+ " ");
        }
    }

    void insertionsort(int a[], int n) {
        int i ,item;
        for( i=1; i<n ; ++i) {
        
            item = a[i];
            int j = i-1;

            while( j>=0 && item < a[j]){
                a[j+1] = a[j];
                j=j-1;
            }
            a[j+1] = item;
        }
    }
}