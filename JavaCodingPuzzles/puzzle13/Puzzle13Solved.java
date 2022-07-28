package puzzle13;
/*
 * Will this code compile? If yes, what will be the output?
 */

public class Puzzle13Solved {

	public static void main(String[] args) {
		String s1 = "Stay Safe";
		String s2 = "Stay Safe";
		
		boolean result = s1 == s2; //compare the memory address
		
		String message = result ? "I'm safe!" : "I'm NOT safe!";
		
		System.out.println(message);
		
	}

}
