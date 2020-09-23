package org.philips.swcoe.qualityGatesDemo;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Rule;
//Class used for testing the maximum element
public class OccurrenceTest { 
	//Empty constructor to attain standards	
	// Test case to return maximum occurred element
	@Test
	public void test1() throws Exception {
		char res=FirstOccurrence.occurrence("sahas");
		assertEquals('a',res);
	}
	@Test
	public void test2() throws Exception {
		char res=FirstOccurrence.occurrence("eaahh");
		assertEquals('a',res);
	}
	@Test
	public void test3() 
	{
		try
		{
			   FirstOccurrence.occurrence("ABC");
			   fail();
		}
		catch(Exception e)
		{
			assertThat(e.getMessage(),is("Not a single element got occurred"));
		}	
	}
	
	@Test
	public void test4()
	{
		try
		{
			   FirstOccurrence.occurrence(" ");
			   fail();
		}
		catch(Exception e)
		{
			assertThat(e.getMessage(),is("Not a single element got occurred"));
		}
		
	}
}
