abstract class vehicle
{
	abstract int numwheels(int ...wheels);
}

class car extends vehicle
{
	int numwheels(int ...wheels)
	{
	int sum=0;
	for(int n :wheels)
	{	
	sum +=n;
	}
	return sum;
	}
}



class truck extends vehicle
{
	int numwheels(int ...wheels)
	{
	int sum=0;
	for(int n : wheels)
	{
	sum +=n;
	}
	return sum;
	}
}




public class Prog7
{
	public static void main(String args[])
	{
	car objcar=new car();
	truck objtruck=new truck();
	
	System.out.println("sum of wheels of car:"+objcar.numwheels(4));
	System.out.println("sum of wheels of truck :"+objtruck.numwheels(8));
	}
}
