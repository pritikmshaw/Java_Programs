
import java.util.*;

    public class StudentDriver {
        public static void main(String[] args) {
            Student o =new Student(); // object o
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name");
            String name = sc.nextLine();
            o.setName(name); // setting name
            int a[]=new int[5];
            int s=0;
            for(int i=0;i<5;i++) {
                System.out.println("Enter marks : ");
                a[i]=sc.nextInt();
                s = s+ a[i];
            }
            o.setA(a); // setting marks
            System.out.println(o.getName()+" got grade "+o.Grade(o.avg(o.getA())));
        }
    }
