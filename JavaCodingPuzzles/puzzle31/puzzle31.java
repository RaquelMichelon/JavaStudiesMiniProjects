package puzzle32;

/*
 * Will this code compile? If yes what will be the output?
 * 
 * we can have the finally block without a catch block
 * the output will be: 43, then End
 */
public class Puzzle32 {

	public static void main(String[] args) {
		int[] a = {12, 17, 43};
		try {
			System.out.println(a[2]); //43
		} finally {
			System.out.print("End"); //End
		}

	}

}
