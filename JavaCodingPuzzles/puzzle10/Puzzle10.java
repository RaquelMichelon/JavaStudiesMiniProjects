package puzzle10;

/*
 * What will be the output of each statement?
 */

public class Puzzle10 {
	
	static int i;
	
	public static void main(String[] args) { 
		int i;
		System.out.println(i); //local variable will take the priority here, but there will be a compilation error here.
	}

}

/*
 * No compilation error until line 12 because one variable is static (class level) and other is local.
 * Local variables will hide static variables with the same name.
 * 
 * The compilation error happened because the local variable wasn't initialized.
 */
