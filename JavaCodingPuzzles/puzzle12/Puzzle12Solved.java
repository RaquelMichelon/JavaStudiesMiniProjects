package puzzle12;

/*
 * I want to print numbers divisible by 5 or 3 from 1 to 20
 * Output should be: 3, 5, 6. 9, 10, 12, 15, 18, 20
 */

public class Puzzle12Solved {

	public static void main(String[] args) {
		for (int i = 1; i <=20; i++) {   
			if (i % 5 == 0 || i % 3 == 0) {
				System.out.println(i); // 5 10 15 20
			}

		}

	}

}
