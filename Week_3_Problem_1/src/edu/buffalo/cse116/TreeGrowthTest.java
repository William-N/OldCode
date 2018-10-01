package edu.buffalo.cse116;

import static org.junit.Assert.*;

import org.junit.Test;

public class TreeGrowthTest 
{
	@Test
	public void testcomputeTreeHeight()
	{
		TreeGrowth testTree = new TreeGrowth();
		
		assertEquals(0, testTree.computeTreeHeight(0));
		assertEquals(1, testTree.computeTreeHeight(1));
		assertEquals(2, testTree.computeTreeHeight(2));
		assertEquals(4, testTree.computeTreeHeight(3));
		assertEquals(5, testTree.computeTreeHeight(4));
		assertEquals(10, testTree.computeTreeHeight(5));		
	}

}
