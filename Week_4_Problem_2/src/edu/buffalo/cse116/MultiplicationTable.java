 package edu.buffalo.cse116;

/**
 * While in primary school, kids often have to generate and check <a href="https://www.timestables.com/">times tables</a>. 
 * When filled in  correctly, each item in the array has the value of multiplying a number by the index for that entry. So if the constant were 3, we 
 * would need to return an array whose entries are 0, 3, 6, 9, 12, etc. This is neither interesting nor exciting, but it is a proven
 * way to help children learn how multiplication works AND help CSE students learn how arrays work.
 *
 * @author Matthew Hertz
 */
public class MultiplicationTable 
{

  /**
   * This returns an int array containing a multiplication table. 
   * Your method should start by allocating an array whose length is {@code numEntries} (e.g., the second parameter). You should then set the value of each
   * entry in the array equal to {@code constant} (e.g., the first parameter) times the index of that entry.<br/>
   * Precondition: numEntries MUST BE 0 or larger. (PRECONDITIONS SPECIFY RESPONSIBILITIES ON A METHOD'S CALLER; YOU SHOULD ASSUME THIS IS TRUE.)
   *
   * @param constant Value whose multiplication table is to be calculated.
   * @param numEntries Length of the array to be returned
   * @return Array of the appropriate length containing the multiplication table for {@code constant}.
   */
  public static int[] generateTable(int constant, int numEntries) 
  {
	  int[] multiplicationTable = new int[numEntries];
	  
	  try
	  {
		  for(int i=0; i<numEntries; i++)
		  {
			  multiplicationTable[i] = (i) * constant;
		  } 
	  }
	  finally
	  {
		  
	  }
	  
	  return multiplicationTable;
  }
    
  /**
   * This method checks if an array of ints contains a correctly calculated multiplication table.<br/>
   * Precondition: multTable IS NOT null. (PRECONDITIONS SPECIFY RESPONSIBILITIES ON A METHOD'S CALLER; YOU SHOULD ASSUME THIS IS TRUE.)
   *
   * @param constant Value used to check the multiplication table.
   * @param multTable Table to be checked.
   * @return True if every entry in the array stores the value of {@code constant} * the index for that entry; or false if at least one entry is incorrect.
   */
  public static boolean checkTable(int constant, int[] multTable) 
  {
	  if(multTable[0] != 0)
	  {
		  return false;
	  }
	  
	  for(int i=0; i<multTable.length; i++)
	  {
		  if(multTable[i] != (i) * constant)
		  {
			  return false;
		  }
	  }
	  
	  return true;
  }
}