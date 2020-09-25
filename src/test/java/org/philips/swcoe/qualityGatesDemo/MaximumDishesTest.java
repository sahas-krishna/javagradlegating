package org.philips.swcoe.qualityGatesDemo;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Rule;
//Class used for testing the maximum element
public class MaximumDishesTest { 
	//Empty constructor to attain standards	
	// Test case to return maximum occurred element
	@Test
	public void test1()throws Exception {
		int result=MaximumDishes.getMaximumDishes(4,new Integer[] {2,5,6,3},new int[] {20,40,90,50});
		assertEquals(8,result);
	}
	@Test
	public void test2() throws Exception{
		int result=MaximumDishes.getMaximumDishes(3,new Integer[] {1,4,6},new int[] {5,24,18});
		assertEquals(3,result);
	}
	@Test
	public void test3() 
	{
		try
		{
			MaximumDishes.getMaximumDishes(3,new Integer[] {1,4,5},new int[] {3,2,8});
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
			MaximumDishes.getMaximumDishes(0,new Integer[] {},new int[] {});
			   fail();
		}
		catch(Exception e)
		{
			assertThat(e.getMessage(),is("No element occurred more than the half of the length of the array"));
		}
		
	}
}
