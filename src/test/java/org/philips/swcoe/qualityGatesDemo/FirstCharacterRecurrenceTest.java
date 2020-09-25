package org.philips.swcoe.qualityGatesDemo;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Rule;
//Class used for testing the maximum element
public class FirstCharacterRecurrenceTest { 
	//Empty constructor to attain standards	
	// Test case to return maximum occurred element
	@Test
	public void test1() throws Exception {
		char res=FirstCharacterRecurrence.getRepeatedCharacter("sahas");
		assertEquals('a',res);
	}
	@Test
	public void test2() throws Exception {
		char res=FirstCharacterRecurrence.getRepeatedCharacter("eaahh");
		assertEquals('a',res);
	}
	@Test
	public void test3() throws Exception
	{
		char res=FirstCharacterRecurrence.getRepeatedCharacter("abc");
		assertEquals(' ',res);	
	}
	
	@Test
	public void test4()
	{
		char res=FirstCharacterRecurrence.getRepeatedCharacter(" ");
		assertEquals(' ',res);
		
	}
}
