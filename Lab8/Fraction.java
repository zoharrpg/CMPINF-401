public class Fraction implements Comparable<Fraction>
{
	private int numer;
	private int denom;

	// ACCESSORS (SETTERS)
	public int getNumer()
	{	return numer;
	}
	public int getDenom()
	{	return denom;
	}
	// MUTATORS (GETTERS)
	public void setNumer( int n )
	{	numer = n;
	}
	public void setDenom( int d )
	{
		if (d==0) { System.out.println("Can't have 0 in denom"); System.exit(0); }
		else denom=d;
	}
	// FULL CONSTRUCTOR - an arg for each class data member
	public Fraction( int n, int d )
	{	int gcd = gcd( n, d );
		setNumer(n/gcd);
		setDenom(d/gcd);
	}
	private int gcd( int n, int d )
	{	int gcd = n<d ? n : d; // same as::  if (n<d) gcd=n; else gcd=d;
		while( gcd > 0 ) // NOT EFFICIENT AS EUCLID BUT SIMPLE
			if (n%gcd==0 && d%gcd==0) 
				return gcd; 
			else --gcd;
		return 1; // they were co-prime no GCD except 1 :(
	}
	// COPY CONSTRUCTOR - takes ref to some already initialized Comparable<Fraction> object
	public Fraction( Fraction other )
	{
		this( other.getNumer(), other.getDenom() ); // call my full C'Tor with other Fraction's data
	}
	// REQUIRED BY THE COMPARABLE INTERFACE 
	// if this == other return 0; if this>other return 1; else return -1
	
	
	
	
	
	
	public int compareTo( Fraction other )
	{
		
		Fraction result = this.subtract(other);
		
		
		
		if(result.getNumer()==0)
		return 0;
		if(result.getNumer()*result.getDenom()>0)
		return 1;
		else
		return -1;
	
		
		

		
		
		// you are only allowed to define one variable in this method
		// that variable should be a Fraction whose value is this - other  
		// HINT: copy in your subtract() method from project 7 and RE-USE it not rewrite it 
		// now you can just examin the numer and denom of your diff fraction
		// to determine that fraction is postive negative or 0
		// return 0 -1 or 1 accordingly
		// NO OTHER VARIABLES Of ANY KIND
		// NO DOUBLES, NO CASTING

		 // REPLACE WITH YOUR CODE
	}
	
	public Fraction multiply(Fraction other)
	{
		return new Fraction(this.numer*other.getNumer(),this.denom*other.getDenom());


	}
	
	public Fraction reciprocal()
	{
		return new Fraction(this.denom,this.numer);
	}
	
	public Fraction subtract(Fraction other)
	{
		return new Fraction(this.multiply(other.reciprocal()).getNumer()-this.multiply(other.reciprocal()).getDenom(),this.getDenom()*other.getDenom());
	}
	
	public String toString()
	{
		return getNumer() +  "/" + getDenom() + "\t=" +  + ((double)getNumer()/(double)getDenom()); 
	}
}// EOF

