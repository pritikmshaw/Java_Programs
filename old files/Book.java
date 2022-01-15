// create class book and create 3 objects of it 
public class Book{
    public static void main (String[] args) {
        
        bookdetails b1 = new bookdetails("Twilight " ,"Stephnimeyer" );
        bookdetails b2 = new bookdetails("Harry Potter ", "J.K Rowling");

        System.out.println("title : " + b1.title+ " author: " +b1.author);
        System.out.println("title : " + b2.title+ " author: " +b2.author);

    }
    public static class bookdetails {
        String title ;
        String author ;
        public bookdetails(String title, String author ) {
            this.title = title ;
            this.author = author ;
        }

    }
}