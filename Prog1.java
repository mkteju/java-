import java.util.*;
class Prog1
{
public static void main(String args[])
{
	int n,i,j,temp;
	int a[]=new  int[args.length];
        for(i=0;i<args.length;i++)
	{
	a[i]=Integer.parseInt(args [i]);
	}
	
	n=args.length;

	for(i=0;i<n;i++)
	{
	for(j=i+1;j<n;j++)
	{
	    if(a[i]>a[j])
	    {
	    temp=a[i];
	    a[i]=a[j];
	    a[j]=temp;
	    }
	}
}


System.out.println("asending order");
for(i=0;i<n-1;i++)
{
System.out.println(a[i]+" , ");
{
System.out.println(a[n-1]);
}
}


	
	