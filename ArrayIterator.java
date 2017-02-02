package Week2;

//To use Iterator and "throw new NoSuchElementException( )".
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Create ArrayIterator class that implements with Iterator.
 * @author Sathira Kittisukmongkol
 */
public class ArrayIterator<T> implements Iterator<T> {
	//attribute for the array we want to iterate over
	private T[] array;
	//To run the sequence of array.
	private int count;
	
	/*
	 * Initialize a new array iterator with the array to process.
     * @param array is the array to iterate over
	 */
	public ArrayIterator(T[] array){
		this.array = array;
		//Set to 0 because it will start from the first element in array.
		this.count = 0;
	}
	
	/*
	 * Return the next non-null element from array, if any.
     * @return the next non-null element in the array.
     * @throws NoSuchElementException if there are no more elements
     *        to return.
	 */
	public T next(){
		//Prevent program to run more than amount of the elements in array.
		if(array!=null && count>=0 && count<array.length){
			//get the count-th element from String array[ ]
			if(array[count]!=null){
				return array[count++];
			}
			else{
				do{
					count = count + 1;
				}while(array[count]==null);
				return array[count++];
			}
		}
		else{
			throw new NoSuchElementException( );
		}
	}
	
	/*
	 * Return true if next element is non-null , false if next element is null.
	 * @return boolean that conveys the status of next element in array.
	 */
	public boolean hasNext(){
		//Prevent program to run more than amount of the elements in array.
		if(array!=null && count>=0 && count<array.length){
			//get the boolean of count-th element from String array[ ]
			if(array[count]!=null){
				return true;
			}
			else{
				return false;
			}
		}else{
			return false;
		}
	}
	
}
