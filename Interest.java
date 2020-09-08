import java.util.*;
public class Interest {
    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter initial balance");
        double principle=sc.nextDouble();

        System.out.println("enter rate ");
        double r= sc.nextDouble();

        System.out.println("enter years: ");
        double t = sc.nextDouble();

        System.out.println("Year"+"\t\t"+"Old Balance"+"\t"+"Interest"+"\t"+"New Balance");

        double a=0 , comp = 0 , p = 0;
        for(int i=1; i<=t ; i++) {
            p=principle+comp;
            a=principle * Math.pow (1+r, i);
            comp = a-principle;

            System.out.println(i+ "\t\t" + p +"\t\t" + comp + "\t\t" + a);
        }

    }
}