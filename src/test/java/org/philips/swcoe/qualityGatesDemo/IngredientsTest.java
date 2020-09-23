package org.philips.swcoe.qualityGatesDemo;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Rule;
//Class used for testing the maximum element
public class IngredientsTest { 
	//Empty constructor to attain standards	
	// Test case to return maximum occurred element
	@Test
	public void test1()throws Exception {
		int res=Ingredients.findy(4,new Integer[] {2,5,6,3},new int[] {20,40,90,50});
		assertEquals(8,res);
	}
	@Test
	public void test2() throws Exception{
		int res=Ingredients.findy(3,new Integer[] {1,4,6},new int[] {5,24,18});
		assertEquals(3,res);
	}
	@Test
	public void test3() 
	{
		try
		{
			   Ingredients.findy(3,new Integer[] {1,4,5},new int[] {3,2,8});
			   fail();
		}
		catch(Exception e)
		{
			assertThat(e.getMessage(),is("No element occurred more than the half of the length of the array"));
		}	
	}
	@Test
	public void test4()
	{
		try
		{
			   Ingredients.findy(0,new Integer[] {},new int[] {});
			   fail();
		}
		catch(Exception e)
		{
			assertThat(e.getMessage(),is("No element occurred more than the half of the length of the array"));
		}
		
	}
}