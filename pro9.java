

import java.util.*;
abstract class cal
{
	abstract int area(int h,int y);
}

class rectangle extends cal
{
	int area(int h,int w)
	{
	return(h*w);
	}
}

class triangle extends cal
{
	int area(int h,int w)
	{
	return((h*w)/2);
	}
}


public class pro9
{
	public static  Scanner in=new Scanner(System.in);
	public static void main(String args[])
	{
	rectangle rec=new rectangle();
	triangle tri=new triangle();
	
	System.out.println("enter height");
	int height=in.nextInt();
	

	System.out.println("enter width");
	int width=in.nextInt();

	System.out.println("area of rectangle:"+rec.area(height,width)+"meter");
	System.out.println("area of triangle:"+tri.area(height,width)+"meter");
	}
}
