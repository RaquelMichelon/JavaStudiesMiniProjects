package puzzle30;

/*
 * Will this code compile? If yes, what will be the output?
 * 
 * Now the code is compiling, but an exception is catched
 */

public class Puzzle30Solved {
	
	public static void main(String[] args) {
		
		int[] integerArray = {10, 20, 30};
		int i = 5, j = 0;
		
		try {
			System.out.println(integerArray[2]); //30
			System.out.println(i/j); //this line will throw ArithmeticException; it should print: Line 1
		} catch (ArithmeticException ae) {
			System.out.println("Line 1");
		} catch (ArrayIndexOutOfBoundsException aibe) {
			System.out.println("Line 2");
		} catch (NumberFormatException nfe) {
			System.out.println("Line 4"); 
		} catch (Exception ae) { //EXCEPTION is a parent class of all specific exceptions
			System.out.println("Line 3");
		}
		
	}

}
