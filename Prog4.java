import java.util.*;
class Prog4
{
public static void main(String args[])
{
	String companyname[]={"company a","company b","company c","company d","company e",};
	int[] price=new int[] {12,67,2,90,4};
	
	int i,j=0;
	int min=price[0];
	for(i=0;i<price.length;i++)
	{
	if(price[i]<min)
	{
	j=1;
	min=price[i];
	}
	}

	System.out.println("company with lowest quoted price :"+companyname[j]);
	System.out.println("smallest elemente presente in given array:"+min);
}
}
