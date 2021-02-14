import java.util.*;
public class Fibonacci {
public static void main (String [] args) {
Scanner sc = new Scanner(System.in);
int n , i=1;
System.out.println("Enter number of terms");
n = sc.nextInt();
System.out.println("n" + "\t" + "Fn" + "\t" + "Fn+1" + "\t" + "Golden Ratio");
System.out.println(i + "\t" + fibo(i) + "\t"+ fibo(i+1) +"\t" + fibo(i+1)*1.0);
i++;
while(i<=n) {
System.out.println(i + "\t" + fibo(i) + "\t" + fibo(i+1) + "\t"
+(fibo(i+1)*1.0/(fibo(i)*1.0)));
i++;
}
}
public static int fibo (int n) {
    if (n==1)
        return 0;
    else if(n==2)
        return 1;
    else
        return fibo(n-1)+fibo(n-2);
}
}
