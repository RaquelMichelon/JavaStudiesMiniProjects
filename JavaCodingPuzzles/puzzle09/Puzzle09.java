package puzzle09;
/*
 * Will this code compile? If yes, what will be the output?
 */

public class Puzzle09 {
	
	public static void main(String[] args) { //inside a static method we can use only static members
		System.out.println(fun());
	}
	
	public int fun() { //this function isn't static, so we will have a compile error
		return 20;
	}

}
