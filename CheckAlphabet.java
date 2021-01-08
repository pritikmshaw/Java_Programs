// C program to check whether the character is an alphabet or not

import java.util.Scanner;
public class CheckAlphabet {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        char ch ;
        System.out.println("Enter the character ");
        ch = sc.next().charAt(0);
        AlphabetCheck(ch);
    }
    public static void AlphabetCheck(char ch) {
        if((ch >= 'a' && ch <= 'z') || ( ch >= 'A' && ch <= 'Z')) {
            System.out.println("It is a alphabet");
        }
        else {
            System.out.println("It is not an alphabet");
        }
    }
}