package org.philips.swcoe.qualityGatesDemo;
import org.junit.Test;
import static org.junit.Assert.*;
//Class used for testing the maximum element
public class MaximumWinTest { 
	//Empty constructor to attain standards	
	// Test case to return maximum occurred element
	@Test
	public void test1()throws Exception {
		int res=MaximumWin.winning(new int[] {0,1,2,3,4,5},new int[] {1,2,3,4,5,6});
		assertEquals(5,res);
	}
	@Test
	public void test2() throws Exception{
		int res=MaximumWin.winning(new int[] {20, 40, 15, 49, 80, 74, 23, 124, 219, 48, 5, 384, 382, 98, 32},new int[] {8, 384, 38, 20, 20, 4885, 292, 10, 429, 21, 76, 32, 12, 56, 74});
		assertEquals(13,res);
	}
}