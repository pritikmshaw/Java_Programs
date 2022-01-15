/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class checkword {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("ennter the word");
        String c;
        c = sc.next();
        //Check(c);
    }
    /*
    public static void Check(char c) {
        if(c>65 && c<90) {
            System.out.println("Upper Case");
        }
        else if (c> 97 && c < 122) {
            System.out.println("Lowe case");
        }
        else if ( c>48 && c < 57 ){
            System.out.println("Number");
        }
        else {
            System.out.println("Symbol");
        }
    }*/
}
