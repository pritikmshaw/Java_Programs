// Program to check if the given character is a vowel or consonant using switch case

import java.util.Scanner;
public class VowelConsonant {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in) ;
        char ch ;
        System.out.println(" enter the character");
        ch = sc.next().charAt(0);
        switch(ch) {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : System.out.println("vowel") ;
            break ;
            default : System.out.println("consonant ");
        }
    }
}