package puzzle30;

/*
 * Will this code compile? If yes, what will be the output?
 */

public class Puzzle30 {
	
	public static void main(String[] args) {
		
		int[] integerArray = {10, 20, 30};
		int i = 5, j = 0;
		
		try {
			System.out.println(integerArray[3]); //this line will throw ArrayIndexOutOfBoundsException, so it should print: Line 2
			System.out.println(i/j);
		} catch (ArithmeticException ae) {
			System.out.println("Line 1");
		} catch (ArrayIndexOutOfBoundsException aibe) {
			System.out.println("Line 2");
		} catch (Exception ae) { //EXCEPTION is a parent class of all specific exceptions
			System.out.println("Line 3");
			
			//COMPILATION ERROR: THIS CATCH IS UNREACHEABLE
		} catch (NumberFormatException nfe) {
			System.out.println("Line 4"); //this code will never be executed, because it is an exception more specific than the above exception
		} 
		
		
	}

}
