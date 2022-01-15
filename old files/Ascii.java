// Program to find the ASCII value of a character is given below.
import java.util.Scanner;
public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char ch ;
        ch = sc.next().charAt(0);
        int ascii = (int) ch ;
        System.out.println("Entered word is "+ch+" and its ascii value is "+ascii);
    }
}