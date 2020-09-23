package org.philips.swcoe.qualityGatesDemo;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Rule;
//Class used for testing the maximum element
public class MaximumTest { 
	//Empty constructor to attain standards	
	// Test case to return maximum occurred element
	@Test
	public void test1()throws Exception {
		int res=Maximum.findy(new int[] {1,2,3,2,2,2,2,2});
		assertEquals(2,res);
	}
	@Test
	public void test2() throws Exception{
		int res=Maximum.findy(new int[] {1,1,1,1,2,2,2,3,3});
		assertEquals(1,res);
	}
	@Test
	public void test3() 
	{
		try
		{
			   Maximum.findy(new int[] {1,2,3,4,5,6});
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
			   Maximum.findy(new int[] {});
			   fail();
		}
		catch(Exception e)
		{
			assertThat(e.getMessage(),is("No element occurred more than the half of the length of the array"));
		}
		
	}
}