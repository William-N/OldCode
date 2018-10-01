package edu.buffalo.cse116;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayMultiSetToArrayTest 
{
	@SuppressWarnings("deprecation")
	@Test
	public void testToArray()
	{
		String[] testArray = new String[] {null, null, "Hello", "World"};
		ArrayMultiSet<String> test = new ArrayMultiSet<String>(testArray);
		assertEquals(new String[] {"Hello","World"}, test.toArray());
		
	}
}
