package edu.buffalo.cse116;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/**
 * Instances of this class are used to represent a multiset -- a searchable collection in which one can add multiple
 * copies of an element.
 *
 * @author Carl Alphonce
 * @author Matthew Hertz
 * @param <E> Element type for this collection
 */
@SuppressWarnings({ "unused", "unchecked" })
public class ArrayMultiSet<E> extends AbstractCollection<E> {
  /** Array in which the elements in this multiset are stored. */
  private E[] _store;

  /** Array indices below this amount contain the active elements in this collection. */
  private int _size;

  /** Modification counter used to preserve the fail-fast nature of its iterators. */
  private long _modCount;

  /** Constant value used as the initial length of the backing store. */
  private static final int DEFAULT_BACKING_STORE_LENGTH = 12;

  /**
   * Creates a new empty multiset.
   */
  public ArrayMultiSet() {
    _store = (E[]) new Object[DEFAULT_BACKING_STORE_LENGTH];
  }

  /**
   * Update the multiset so that it includes all of the elements from before the call AND the given element.
   *
   * @param e Item to be added to this collection.
   * @return True when the element was successfully added; false otherwise. This always returns true.
   */
  @Override
  public boolean add(E e) {
    _store = getStoreWithSpace();
    includeElement(e);
    return true;
  }

  /**
   * Checks if the backing store has a space in which another element can be stored. When there is no space, the method
   * allocates an array with twice as much space, copies the existing elements into that new array, and then returns
   * that new array. Otherwise, it returns the original backing store.
   */
  private E[] getStoreWithSpace() {
	  //If space is full, double space, copy array
	  if(this._size == this._store.length)
	  {
		  E[] newArray = (E[]) new Object[this._store.length * 2];
		  //might be problem with itterating bounds
		  for(int i=0; i<this._size; i++)
		  {
			  newArray[i] = this._store[i];
		  }
		  
		  return newArray;
	  }
	  //Otherwise, just return the original array
	  else
	  {
		  return this._store;
	  }
  }

  /**
   * Includes the element in the multiset while updating the instance variables so that the class invariant is
   * preserved.<br/>
   * Precondition: _store is guaranteed to have sufficient space for including the new element (preconditions are
   * guaranteed to be true at the start)
   *
   * @param elem Element to be included in the multiset
   */
  private void includeElement(E elem) {
	  this._store[this._size] = elem;
	  this._size ++;
	  this._modCount++;
  }

  @Override
  public int size() {
    return _size;
  }

  @Override
  public boolean isEmpty() {
    return _size == 0;
  }

  @Override
  public Iterator<E> iterator() {
    // To be discussed next week
    throw new UnsupportedOperationException();
  }
}