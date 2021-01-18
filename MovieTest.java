// create a class name movie and create an array of 5 elements 
import java.util.Scanner;
public class MovieTest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie m[]= new Movie [2];
        System.out.println("enter the elements : ");
        int i =0;
        for(i = 0; i<m.length ; i++ ) {
            m[i] = new Movie();
           System.out.println("enter the movie details name rateing and budget");
            m[i].name = sc.next();
            
            m[i].rating = sc.nextInt();
           
            m[i].budget = sc.nextLong();
        }
        for(i = 0; i<m.length ; i++ ) {
            m[i].display();
        }
    }
    public static class Movie {
        String name ;
    int rating ;
    long budget ;
        public  Movie()
        {
            name="" ;
            rating=0 ;
           budget=0;
        }
    
    void display() {
        System.out.println("Name :" +name+ "rating : "+rating+ "budget : "+budget);
    }
}
   
}