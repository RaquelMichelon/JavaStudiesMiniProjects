package puzzle07;

/*
 * Will this code compile? If yes, what will be the output?
 */

public class Puzzle07 {
	
	static int i = 10; //static variable value = 10
	
	//main method is static, so it will be able to use only static members
	//changeValue is static
	// i is static
	//so it is ok, no compilation error here
	public static void main(String[] args) {
		changeValue(i); //here we are modifying the value of i inside the method
		System.out.println(i); //here we are printing the value of the static variable, which was not modify: is 10.
	}
	
	public static void changeValue(int i) { //i local variable value = 10
		i = 50; //modifying its value to 50
	}

}
