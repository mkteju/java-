import java.util.*;
import java.io.*;

interface numbers
{
	int process(int x,int y);
}

class sum implements numbers
{
	public int process(int x,int y)
	{	
	return (x+y);
	}
}


class Average implements numbers
{
	public int process(int x,int y)
	{
	return ((x+y)/2);
	}
}


public class Prog5
{
	public static Scanner in=new Scanner(System.in);
	public static void main(String args[])
	{

	System.out.println("eneter two number");
	int num1=in.nextInt();
	int num2=in.nextInt();
	
	sum objsum=new sum();
	Average objavg=new Average();

	System.out.println("sum of two numbers ::"+objsum.process(num1,num2));
	System.out.println("average of two numbers ::"+objavg.process(num1,num2));
	}
}
