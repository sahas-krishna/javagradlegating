package org.philips.swcoe.qualityGatesDemo;
//A class to find the maximum occurred element
public final class Ingredients{
	//Constructor
	private Ingredients() 
	{}
	 //To find the maximum occurrence
	public  static int findy(final int n,final Integer[] req,final int... provided)throws InvalidException
	{		
		
		int a=elem(n,req,provided);
		if(a>0 && a!=Integer.MAX_VALUE)
			return a;
		throw new InvalidException("No element occurred more than the half of the length of the array");	
	}
	public static int elem(final int n,Integer[] req,final int... provided)
	{	
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			req[i]=provided[i]/req[i];
			min=min>req[i]?req[i]:min;
		}
		
		return min;
	}
}
