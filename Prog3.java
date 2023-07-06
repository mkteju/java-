import java.util.*;
class Prog3
{
public static void main(String args[])
{
	int m,n,c,d;
	Scanner in=new Scanner(System.in);
	System.out.println("enter rows and column no of matrix");
	
	m=in.nextInt();
	n=in.nextInt();

	
	int first[][]=new int[m][n];
	int second[][]=new int [m][n];
	int sum[][]=new int[m][n];


	System.out.println("enter first matrix");
	for(c=0;c<m;c++)
		for(d=0;d<n;d++)
		first[c][d]=in.nextInt();

	System.out.println("enter first matrix");
	for(c=0;c<m;c++)
		for(d=0;d<n;d++)
		second[c][d]=in.nextInt();
	
	System.out.println("sum of metrix");
	for(c=0;c<m;c++)
	{
		for(d=0;d<n;d++)
		System.out.println(sum[c][d]+"\t");
		System.out.println();

	}
    }
}
	

	