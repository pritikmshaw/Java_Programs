// check the vowel and consonant 
import java.util.*;
public class Vowel {

    static void vowel (char ch) {
        if((ch=='a' || ch=='e' || ch =='i' || ch=='o' || ch=='u') || (ch=='A' || ch == 'E' || ch =='I' || ch=='O' || ch=='U')) {
            System.out.print("vowel");
        }
        else {
            System.out.print("Consonant");
        }
    }
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word :");
        char ch = sc.next().charAt(0);
        
        vowel(ch);
        //System.out.println("Word is ")

    }
}