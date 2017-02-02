package Week2;

/**
 * The Main class is to run the program.
 * @author Sathira Kittisukmongkol
 */
public class Main {
	
	public static void main(String[]args){
		//Create an array of String.
		String[] fruit = {"apple",null,null,"banana"};
		//Create object of ArrayIterator class and put previous array into it.
		ArrayIterator<String> it = new ArrayIterator<String>(fruit);
		//To show the result in each line.
		System.out.println(it.hasNext()); //return true.
		System.out.println(it.next()); //return "apple".
		System.out.println(it.next()); //return "banana". (skip over null element)
		System.out.println(it.hasNext()); //return false.
		System.out.println(it.next()); // throws NoSuchElementException.

		//Create an array that is array containing null.
		Object[] array = new Object[1];
		//Create object of ArrayIterator class and put previous array into it.
		ArrayIterator it2 = new ArrayIterator(array);
		System.out.println(it2.hasNext()); //return false.
		System.out.println(it2.next()); //throws NoSuchElementException.
	}
}
