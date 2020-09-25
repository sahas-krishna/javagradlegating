package org.philips.swcoe.qualityGatesDemo;
public class FirstCharacterRecurrence {
	private FirstCharacterRecurrence()
	{
		
	}
	public static char getRepeatedCharacter(String inputString)
	{
		for(int i=0;i<inputString.length();i++)
		{
			if(inputString.substring(0,i).contains(""+inputString.charAt(i)))
				return inputString.charAt(i);
		}
		return ' ';
	}

}
