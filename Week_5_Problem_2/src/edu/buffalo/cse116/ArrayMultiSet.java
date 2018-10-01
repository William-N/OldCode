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
   * Return true if at least one element in the multiset is equal to the given object. When {@code obj} is null, it must
   * use the {@code ==} operator to perform these checks, but when {@code obj} is not null, the {@link Object#equals}
   * method is used.
   *
   * @param obj Object (or null) for which we will search
   * @return {@code true} if {@code obj} was found; {@code false} if a match could not be found.
   */

  public boolean contains(Object obj) {
    int indexFound = findFirstIndex(obj);
    return indexFound != -1;
  }

  /**
   * Removes a single instance of the given object, if one can be found in the ArrayMultiSet. The method returns
   * {@code true} if a match was found (and removed) and {@code false} if no match was found. Since the order of
   * elements in a MultiSet is not guaranteed, we use this to simplify how we remove an item.
   *
   * @param obj Object (or null) which we want to remove
   * @return {@code true} if {@code obj} was found and an instance removed; {@code false} if a match could not be found.
   */
  @Override
  public boolean remove(Object obj) {
    int indexFound = findFirstIndex(obj);
    if (indexFound != -1) {
      removeAtIndex(indexFound);
      return true;
    }
    return false;
  }

  /**
   * Removes the element found at the given index. This is done while maintaining the class invariant, by first
   * replacing the element being removed with the element at the largest index in the MultiSet. Once this is done, we
   * assign null to the element that has been moved and then update any instance variables to insure class invariant
   * remain true.<br />
   * Precondition: {@code i} is a valid index within {@code _store} AND {@code _size} is not 0.
   *
   * @param removeIdx Index of the element to remove from the MultiSet.
   */
  private void removeAtIndex(int removeIdx) 
  {
	  /*
	  if(removeIdx > this._store.length)
		  return;
	  
	  if(removeIdx == this._size - 1)
	  {
		  this._store[removeIdx] = null;
		  -- this._size;
		  ++ this._modCount;
		  return;
	  }
	  
	  this._store[removeIdx] = this._store[this._size - 1];
	  this._store[this._size - 1] = null;
	  -- this._size;
	  ++ this._modCount;
	  */
	  
	  this._store[removeIdx] = this._store[this._size - 1];
	  this._store[this._size - 1] = null;
	  this._size = this._size - 1;
	  
	  
  }

  /**
   * Returns the first backing store index where {@code obj} is found in the ArrayMultiSet. If {@code obj} is not an
   * element in the ArrayMultiSet, -1 is returned.
   *
   * @param obj Object (or null) for which we return the first index at which it is found in a valid location in _store
   * @return Index in _store at which the item is found or -1 if it is not in the ArrayMultiSet.
   */
  private int findFirstIndex(Object obj) {
	  for(int i=0; i<this._size; i++)
	  {
		  if(this._store[i] == obj)
		  {
			  return i;
		  }
		  else if(_store[i] != null && this._store[i].equals(obj))
		  {
			  return i;
		  }
	  }
	  
	  return -1;
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
  
  public static void main(String[] args)
  {
	  ArrayMultiSet<String> test = new ArrayMultiSet<String>();
	  test._store[0] = "hi";
	  test._store[1] = "hello";
	  test._store[2] = "world";
	  
	  test.removeAtIndex(3);
	  test.removeAtIndex(2);
	  System.out.println();
  }

}
