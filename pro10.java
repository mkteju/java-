abstract class vegetable
{
	public static String col;
}
class potato extends vegetable
{
	public String toString()
	{
	col="yellow";
	return "color of potato:"+col;
	}
}

class carrot extends vegetable
{
	public String toString()
	{
	col="red";
	return "color of carrot:"+col;
	}
}


class cabage extends vegetable
{
	public String toString()
	{
	col="green";
	return "color of cabage:"+col;
	}
}

public class pro10
{
	public static void main(String args[])
	{
	potato po=new potato();
	carrot ca=new carrot();
	cabage cab=new cabage();
	
	System.out.println(po);
	System.out.println(ca);
	System.out.println(cab);
	}
}



