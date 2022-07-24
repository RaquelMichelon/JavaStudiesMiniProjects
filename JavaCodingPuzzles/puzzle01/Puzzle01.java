package puzzle01;

/*
 * Will this code compile? If yes, what will be the output?
 */

public class Puzzle01 {
	
	public void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) { //no error 
		Puzzle01 p1 = Puzzle01(); //new keyword is missing - compilation error - not able to find the method Puzzle01()
		p1.sum(10, 20); //there is an ambiguity - compilation error - duplicate methods
		System.out.println(p1.sum(10, 20));
	}

}

/*
 * How to fix duplicate methods?
 * Changing the data types. There are two simple solutions called METHOD OVERLOADING
 * 1. change the number of parameter
 * or
 * 2. change the type of parameter
 */
