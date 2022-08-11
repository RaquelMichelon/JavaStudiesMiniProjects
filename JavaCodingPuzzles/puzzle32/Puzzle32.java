package puzzle32;

/*
 * Will this code compile. If yes, what will be the output.
 * 
 * This code will print 30, then print END!!!, then return true
 */
public class Puzzle32 {

	public static void main(String[] args) {
		method1();

	}
	
	public static boolean method1() {
		int[] a = {10, 20, 30};
		
		try {
			System.out.println(a[2]);
			return true; // first execute the finally block, then return the fuction
		} finally {
			//finally block is always executed regardless of the exception we are getting or not
			System.out.println("END!!!");
		}
	}

}
