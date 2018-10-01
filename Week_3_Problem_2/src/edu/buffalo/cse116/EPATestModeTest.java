package edu.buffalo.cse116;

import static org.junit.Assert.*;

import org.junit.Test;

public class EPATestModeTest 
{
	@Test
	public void testMPG()
	{
		EPATestMode test1 = new EPATestMode();
		EPATestMode test2 = new EPATestMode();
		EPATestMode test3 = new EPATestMode();
		
		//reset readings should never take a 
		//negative value, but changes to code
		//not requested.
		test1.resetReadings(-1);
		test2.resetReadings(0);
		test3.resetReadings(1);
		
		//mpg should return 0 when second param <= 0
		assertEquals(-1, test1.mpg(0, 0), 0.01);
		assertEquals(-1, test1.mpg(2, -1), 0.01);
		assertEquals(6, test2.mpg(30, 5), 0.01);	
		assertEquals(0.666666666, test2.mpg(2, 3), 0.01);
	}
}
