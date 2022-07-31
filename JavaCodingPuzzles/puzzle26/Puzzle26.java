package puzzle26;

/*
 * Will this code compile? If yes, what will be the output.
 */


public class Puzzle26 { 

	public static void main(String[] args) {
		int i = 20;
		double d = i; //20 -> java will not give a compilation error because integer is 4 byte long and double is 8 byte long
		
		int j = d; //HERE has a compilation error - trying to store big value in a smaller data type
		double d1 = 10; 
		
		System.out.print(j / d1); 


	}

}

/*
 * It is ok store a smaller value into a big data type.
 * to solve the expression on the line 14, we need to do an explicit casting:
 * int j = (int)d;
 * 
 */


