package puzzle12;

/*
 * Will this code compile? If yes, will it print our expected output?
 * 
 * 
 * I want to print numbers divisible by 5 or 3 from 1 to 20
 * Output should be: 3, 5, 6. 9, 10, 12, 15, 18, 20
 */

public class Puzzle12 {

	public static void main(String[] args) {
		for (int i = 1; i <=20; i++) {   //there is no error inside this code
			if (i % 5 == 0) {
				System.out.println(i); // 5 10 15 20
			}
			if (i % 3 == 0) {
				System.out.println(i); // 3 5 9 12 15 18
			}
		}

	}

}

/*
 * Number 15 will be printed twice because it satisfy both conditions
 * If you don't want a duplicate number, is necessary use the "else"
 * because it just will enter inside the else if first condition is false.
 * If the first condition is true, we don't need to check the second condition because we need to
 * print one or another.
 * Another solution could be using an or operator inside the first condition.
 */
