package org.philips.swcoe.qualityGatesDemo;
import java.util.*;
//A class to find the maximum occurred element
public final class Maximum{
	//Constructor
	private Maximum() 
	{}
	 //To find the maximum occurrence
	public static  List<Integer> convert(int...array)
	{
		List<Integer> larray=new ArrayList<>();
		for(final Integer index:array)
		{
			larray.add(index);
		}
		return larray;
	}
	public  static int findy(final int... array)throws InvalidException
	{		
		List<Integer> larray=convert(array);
		Set<Integer>unique=new HashSet<>(larray);
		int a=elem(larray,unique);
		if(a!=Integer.MAX_VALUE)
			return a;
		throw new InvalidException("No element occurred more than the half of the length of the array");	
	}
	public static int elem(List<Integer>larray,Set<Integer>unique)
	{	
		for(Integer element:unique)
		{
			if(Collections.frequency(larray, element)>=larray.size()/2)
			{
				return element;
			}
		}
		return Integer.MAX_VALUE;
		
	}
}