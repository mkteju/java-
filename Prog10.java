abstract class vegetable
{
	public static String col;
}

class cabbage extends vegetable
{
	public String toString()
	{
	col="green";
	return "color of cabbage :"+col;
	}
}

class carrot extends vegetable
{
	public String toString()
	{
	col="red";
	return "color of carrot :"+col;
	}
}

class potato extends vegetable
{
	public String toString()
	{
	col="potato";
	return "color of potato :"+col;
	}
}


public class Prog10
{
	public static void main(String args[])
	{
	cabbage cab=new cabbage();
	carrot carr=new carrot();
	potato po=new potato();

	System.out.println(cab);
	System.out.println(carr);
	System.out.println(po);
	}
}
