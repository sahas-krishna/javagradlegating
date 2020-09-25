package org.philips.swcoe.qualityGatesDemo;
//A class to find the maximum occurred element
public final class MaximumDishes{
	//Constructor
	private MaximumDishes() 
	{}
	 //To find the maximum occurrence
	public  static int getMaximumDishes(final int n,final Integer[] req,final int... provided)throws InvalidException
	{		
		
		int output=getCount(n,req,provided);
		if(output>0 && output!=Integer.MAX_VALUE)
			return output;
		throw new InvalidException("No element occurred more than the half of the length of the array");	
	}
	public static int getCount(final int n,Integer[] req,final int... provided)
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
