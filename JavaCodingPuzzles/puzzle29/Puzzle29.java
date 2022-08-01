package puzzle29;

/*
 * Will this code compile? If yes, what will be the output?
 */

public class Puzzle29 { 

	public static void main(String[] args) {
 
		int i = 5;
		
		int result = ++i + ++i + i++; // ++i first increment, after assign; i++ first assign then increment; 20 = 6+7+7
		
		System.out.print(i); //8

		System.out.print(result); //200

	}

}

/*
 * There is no compilation error in this program. 
 */
