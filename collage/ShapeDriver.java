import java.util.Scanner;

public class ShapeDriver { 
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Shape shape=new Shape();  // creating object
		System.out.println("Enter\n1 for square\n2 for rectangle\n3 for triangle");
		int n=sc.nextInt();
		// checking through switch case and printing thr right ans 
		switch(n){
		
		case 1:
			System.out.println("Enter side of square=");
			float sq = shape.calcArea(sc.nextFloat());
			System.out.println("Area ="+sq);break;
		case 2:
			System.out.println("Enter side of rectangle=");
			float a=sc.nextFloat();
			float b=sc.nextFloat();
			System.out.println("Area ="+shape.calcArea(a,b));break;
		case 3:
			System.out.println("Enter side of triangle");
			double z=sc.nextFloat();
			double x=sc.nextFloat();
			double y=sc.nextFloat();
			System.out.println("Area ="+shape.calcArea(z,x,y));break;
		default:
			System.out.println("Invalid option");break;
		}
	}
}