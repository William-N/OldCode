package edu.buffalo.cse116;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * Instances of this class are used to represent a multiset -- a searchable collection in which one can add multiple
 * copies of an element.
 *
 * @author Carl Alphonce
 * @author Matthew Hertz
 * @param <E> Element type for this collection
 */
@SuppressWarnings({"unused", "unchecked"})
public class ArrayMultiSet<E> extends AbstractCollection<E> {
  /** Array in which the elements in this multiset are stored. */
  private E[] _store;
  
  /**
   * Array indices below this amount contain the active elements in this collection.
   */
  private int _size;

  /**
   * Modification counter used to preserve the fail-fast nature of its iterators.
   */
  private long _modCount;

  /** Constant value used as the initial length of the backing store. */
  private static final int DEFAULT_BACKING_STORE_LENGTH = 12;


  /**
   * Creates a new empty multiset.
   */
  public ArrayMultiSet() {
    _store = (E[])new Object[DEFAULT_BACKING_STORE_LENGTH];
  }
  
  /**
   * Create a new multiset instance. The multiset's backing store will need to be allocated with a length equal to the length of {@code initialArray}.
   * The multiset's elements should be aliases for the entries in {@code initialArray}. <br/>
   * Prerequisite: {@code initialArray} CANNOT be null.
   *
   * @param initialArray Array containing the initial elements for our ArrayMultiSet.
   */
  public ArrayMultiSet(E[] initialArray) {
	  this._size = initialArray.length;
	  this._store = (E[])(new Object[this._size]);
	  	  
	  for(int i=0; i<initialArray.length; i++)
	  {
		  this._store[i] = initialArray[i];
	  }	  
  }
  
  @Override
  public boolean isEmpty() {
    return _size == 0;
  }

  @Override
  public int size() {
    return _size;
  }
  
  /**
   * Returns a newly allocated array containing the elements in the Multiset. The returned array should have a length equal to the
   * current size of the ArrayMultiSet.
   *
   * @return Newly allocated array whose entries are aliases to the elements in the Multiset.
   */
  @Override
  public E[] toArray() {
	  
	  int addArrayCounter = 0;
	  int counter = 0;
	  
	  for(int i=0; i<this._store.length; i++)
	  {
		  if(this._store[i] != null)
		  {
			  counter++;
		  }
	  }
	  
	  E[] returnArray = (E[])(new Object[counter]);
	  
	  for(int i=0; i<this._store.length; i++)
	  {
		  if(this._store[i] != null)
		  {
			  System.out.println(this._store[i]);
			  returnArray[addArrayCounter] = this._store[i];
			  addArrayCounter++;
		  }
	  }
	  
	  for(E s: returnArray)
	  {
		  System.out.println(s);
	  }
	  
	  return returnArray;
  }


  @Override
  public Iterator<E> iterator() {
    // To be discussed next week
    throw new UnsupportedOperationException();
  }
}
