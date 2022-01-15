// largest among array
public class ArrayLargest {
    public static void main (String[] args) {
        int a[]= new int [5];
        a[0] = 10;
        a[1] = 30;
        a[2] = 50;
        a[3]= 40;
        a[4]=5;
        int i = 0;
        int max = a[0];
        for(i=0;i<a.length;i++) {
            if(a[i] > max ){
                 max = a[i];
            }
        }
        System.out.println(+max +" Is the largest");
    }
}