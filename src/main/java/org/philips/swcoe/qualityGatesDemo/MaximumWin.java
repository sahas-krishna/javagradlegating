package org.philips.swcoe.qualityGatesDemo;
import java.util.*;
public class MaximumWin {
	private MaximumWin()
	{
		
	}
	public static int winning(int[] a1,int... a2)
	{
		ArrayList<Integer>mine=new ArrayList<>();
		for(Integer ii:a1)	
			mine.add(ii);
		ArrayList<Integer>opponent=new ArrayList<>();
		for(Integer ii:a2)
		opponent.add(ii);
		int wins=number(mine,opponent);
		return wins;
	}
	public static int number(List<Integer>al1,List<Integer>al2)
	{
		int count=0;
		while(!al1.isEmpty()){
			if(Collections.min(al2)<=Collections.min(al1))
			{
				al1.remove(al1.indexOf(Collections.min(al1)));
				al2.remove(al2.indexOf(Collections.min(al2)));
				count++;
				
			}
			else
				al1.remove(al1.indexOf(Collections.min(al1)));
		}
		return count;
	}
}
