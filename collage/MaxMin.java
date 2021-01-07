public class MaxMin {
    public static void main( String [] args) {
        
        int a[] = { 3 , 56 , 54, 62, 100 ,2 ,15 ,20, 45, 10 }; //array 
        int max = a[0];
        int min = a[0];

        {
            for ( int n:a) {
                
                if(max<n) {
                    max = n;
                }

                if (min>n) {
                    min = n;
                }
            }
        }
        System.out.println("Maximun no is " + max);
        System.out.println("Minimun no is " + min);

    }
}