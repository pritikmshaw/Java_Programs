import java.util.*;
public class vowel  {
public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    char ch ;
    System.out.println("Enter the character : ");
    ch = sc.next().charAt(0);

    vowelandconsonant(ch);
}

public static void vowelandconsonant(char ch) {
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        System.out.println("Vowel");
    else
        System.out.println("Consonant");
}

}

// Another way
/* import java.util.*;
public class vowel  {
public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    char ch ;
    System.out.println("Enter the character : ");
    ch = sc.next().charAt(0);

    
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        System.out.println("Vowel");
    else
        System.out.println("Consonant");
}
}
*/
