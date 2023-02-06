/* Fraction.java  A class (data type) definition file
   This file just defines what a Fraction is
   This file is NOT a program
   ** data members are PRIVATE
   ** method members are PUBLIC
*/
public class Fraction
{
	// DO NOT MODIFY THE CODE BELOW - USE AS GIVEN

	private int numer;
	private int denom;

	// ACCESSORS
	public int getNumer()
	{
		return numer;
	}
	public int getDenom()
	{
		return denom;
	}
	public String toString()
	{
		return numer + "/" + denom;
	}

	// MUTATORS
	public void setNumer( int n )
	{
		numer = n;
	}
	public void setDenom( int d )
	{
		if (d!=0)
			denom=d;
		else
		{
			// error msg OR exception OR exit etc.
		}
	}

	// DEFAULT CONSTRUCTOR - no args passed in
	public Fraction(  )
	{
		this( 0, 1 ); // "this" means call a fellow constructor
	}

	// 1 arg CONSTRUCTOR - 1 arg passed in
	// assume user wants whole number
	public Fraction( int n )
	{
		this( n, 1 ); // "this" means call a fellow constructor
	}

	// FULL CONSTRUCTOR - an arg for each class data member
	public Fraction( int n, int d )
	{
		int gcd = gcd(n,d);
		setNumer(n/gcd);
		setDenom(d/gcd);
	}

	// COPY CONSTRUCTOR - takes ref to some already initialized Fraction object
	public Fraction( Fraction other )
	{
		this( other.getNumer(), other.getDenom() ); // call my full C'Tor with other Fraction's data
	}

	//  W R I T E   Y O U R   A R I T H M E T I C   O P E R A T I O N   M E T H O D S
	//  A T   B O T T O M   O F  F I L E  &  R E M O V E   A L L   C O M M E N T S

	
	
	public Fraction multiply(Fraction other)
	{
		return new Fraction(this.numer*other.getNumer(),this.denom*other.getDenom());


	}
	public Fraction reciprocal()
	{
		return new Fraction(this.denom,this.numer);
	}
	public Fraction divide(Fraction other)
    {
		return this.multiply(other.reciprocal());

	}
	public Fraction add(Fraction other)
	{
	return new Fraction(this.multiply(other.reciprocal()).getNumer()+this.multiply(other.reciprocal()).getDenom(),this.getDenom()*other.getDenom());
	}
	public Fraction subtract(Fraction other)
	{
		return new Fraction(this.multiply(other.reciprocal()).getNumer()-this.multiply(other.reciprocal()).getDenom(),this.getDenom()*other.getDenom());
	}
	
	
	// GCD MUST BE RECURSIVE (see recursion slide)
	private int gcd( int n, int d)
	{
		int high,low;
		if(n>=d)
		{
		  high =n;
		  low=d;
		}else
		{
			high=d;
			low=n;

		}
		if(high%low==0)
		return low;
		else
		return gcd(low,high%low);
		
			// replace this line with
    }
}// EOF
