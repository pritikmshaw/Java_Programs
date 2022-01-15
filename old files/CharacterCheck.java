// say wheather the entered character is lower upeer digit or symbol
import java.util.Scanner;
public class CharacterCheck {
   
    public static void TestCase(char ch) {
        if (ch >= 65 && ch <= 90 ) {
            System.out.println("Upper case");
        }
        else if ( ch >= 97 && ch <= 122 ){
            System.out.println("Lower case");
        }
        else if (ch >= 48 && ch <=57) {
            System.out.println("digit");
        }
        else{
            System.out.println("Sysmbol");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char ch ;
        ch = sc.next().charAt(0);
        TestCase(ch);
    }

    
}