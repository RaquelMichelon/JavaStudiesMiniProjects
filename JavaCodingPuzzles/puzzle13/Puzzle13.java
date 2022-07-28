package puzzle13;
/*
 * Will this code compile? If yes, what will be the output?
 */

public class Puzzle13 {

	public static void main(String[] args) {
		String s1 = "Stay Safe";
		String s2 = "Stay Safe";
		
		boolean result = s1 == s2; //compare the memory address
		
		switch (result) { //trying to pass boolean value inside a switch statement, which is NOT supported by java
		case true:
			System.out.println("I'm safe!");
			
		case false: 
			System.out.println("I'm NOT safe!");
			
		default: //working with true or false doesn't make any sense use this default value
			System.out.println("I'm not sure if I'm safe!");
		}
	}

}

/*
 * In this case we have a compilation error because switch statement doesn't support boolean values 
 * If we have a boolean variable, if and else statement will fit better.
 */
