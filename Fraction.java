public class Fraction {

	private int num;
	private int den;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}
	
	public Fraction(int num, int den)
	{
		this.num = num;
		this.den = den;
	}

	public Fraction()
	{	
		num = 0;
		den = 1;
	}
	
	public static Fraction add(Fraction a, Fraction b)
	{
		Fraction c = new Fraction();
				
		c.num = a.num * b.den + b.num * a.den;
		c.den = a.den * b.den;
		int d = gcd(c.num, c.den);
		c.num/=d;
		c.den/=d;
		
		return c;
	}
	public static Fraction sub(Fraction a, Fraction b)
	{
		Fraction c = new Fraction();
				
		c.num = a.num * b.den - b.num * a.den;
		c.den = a.den * b.den;
		int d = gcd(c.num, c.den);
		c.num/=d;
		c.den/=d;
		
		return c;
	}
	public static Fraction mul(Fraction a, Fraction b)
	{
		Fraction c = new Fraction();
				
		c.num = a.num * b.num;
		c.den = a.den * b.den;
		
		return c;
	}
	
	public static Fraction div(Fraction a, Fraction b)
	{
		Fraction c = new Fraction();
				
		c.num = a.num / b.den ;
		c.den = b.num / a.den;
		
		
		return c;
	}
	
	private static int gcd(int a, int b)
	{
		if(a%b==0)
			return b;
		return gcd(b, a%b);
	}
	public String toString()
	{
		return num + "/" + den;
	}
	
	

	public double getValue()
	{
		return (double)num/den;
	}
}
