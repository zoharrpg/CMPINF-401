/*
	Coin.java THIS IS THE ONLY FILE YOU HAND IN
	THERE IS NO MAIN METHOD IN THIS CLASS!
*/
import java.util.Random;
public class Coin
{
	private final int TAILS=0;
	private final int HEADS=1;
	private Random r;
	private int numHeads,numTalis;

	public Coin(int seed)
	{ 
		r = new Random(seed);
		reset();
	}
	public void reset()
{
	setNumHeads(0);
	setNumTails(0);
}
public String flip()
{
	int side = r.nextInt(2);
	if(side==HEADS)
	{
		setNumHeads(getNumHeads()+1);
		return "H";
	}
	else
	{
		setNumTails(getNumTails()+1);
		return "T";
	}

}
public int getNumHeads()
{
	return numHeads;
}
public int getNumTails()
{
	return numTalis;
}
private void setNumHeads(int h)
{
	numHeads=h;
}
private void setNumTails(int t)
{
	numTalis=t;
}


} // END COIN CLASS