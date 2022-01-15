// command line argument type of program 
public class ComandLineTest{
    public static void main(String[] args) {
        int count ;
        String s;
        int i = 0;
        count = args.length;
        
        System.out.println("No og arguments : "+count);
        while ( i < count) {
            s = args[i];
            i= i + 1;
            System.out.println(i+":" +"Java is " + s);
        }

    }
}