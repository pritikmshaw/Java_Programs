
public class FractionDriver {

	public static void main (String[] args) {
		Fraction f=new Fraction();
		Fraction f1=new Fraction(100,10);
		Fraction f2=new Fraction(500,50);
		f=Fraction.add(f1, f2);
		System.out.println(f);
		f=Fraction.mul(f1, f2);
		System.out.println(f);
		f=Fraction.div(f1, f2);
		System.out.println(f);
		f=Fraction.sub(f1, f2);
		System.out.println(f);
		double a=f.getValue();
		System.out.println(a);
	}
	
}