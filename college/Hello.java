import java.util.* ;
public class Hello  {
    public void nonStaticMethod() {
        System.out.println("Non Static Method");
    }

    public static void staticmMthod() {
        System.out.println("Static method");
    }
    public static void main (String args[]) {
        System.out.println("Hello World");
        Hello helloObject= new Hello();
        helloObject.nonStaticMethod();
        staticmMthod();
    }

}