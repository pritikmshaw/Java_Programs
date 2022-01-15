// create class book and create 3 objects of it 
public class Library{
    public static void main (String[] args) {
        
        Book b1 = new Book(1,"Twilight " ,"Stephnimeyer" );
        Book b2 = new Book(2,"Harry Potter ", "J.K Rowling");
        System.out.println("id is: " + b1.id + " Title : " + b1.title+ " Author: " +b1.author);
        System.out.println("id is: " + b2.id+ " Title : " + b2.title+ " Author: " +b2.author);
    }
    public static class Book {
        int id;
        String title ;
        String author ;
        public Book(int id , String title, String author ) {
            this.id = id;
            this.title = title ;
            this.author = author ;
        }

    }
}