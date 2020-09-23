package org.philips.swcoe.qualityGatesDemo;
public class FirstOccurrence {
	public static char occurrence(String s)throws InvalidException
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.substring(0,i).contains(""+s.charAt(i)))
				return s.charAt(i);
		}
		throw new InvalidException("Not a single element got occurred");
	
	}

}