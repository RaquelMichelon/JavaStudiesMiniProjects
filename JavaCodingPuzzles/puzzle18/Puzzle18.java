package puzzle18;

/*
 * Will this code compile? If yes, what will be the output?
 */

public class Puzzle18 {
	//as a static variable, it will be implicitly initialized
	static int data[]; //integer array that wasn't initialized explicitly - default value is null

	public static void main(String[] args) { //main is a static method, so variables used here need to be static too
		System.out.println(data.length); //data variable is static, so no compilation error, although this will give a runtime error because data is null;
	//SPECIFIC ERROR: NULL POINTER EXCEPTION
	}
}
