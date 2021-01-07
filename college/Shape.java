// imorting package
import java.lang.Math;
// creating class
public class Shape {
    // method for sq
	public float calcArea(float side){
		return side * side;
    }
    
    // method for rectangle
	public float calcArea(float length,float breadth){
		return length * breadth;
    }
    
    // method for triangle
	public double calcArea(double a,double b,double c){
		if((a+b)>c || (a+c)>b || (c+b)>a){
			double s=(a+b+c)/2;
			return (Math.sqrt(s*(s-a)*(s-b)*(s-c)));
		}
		else{
			return -1;
		}
	}

}