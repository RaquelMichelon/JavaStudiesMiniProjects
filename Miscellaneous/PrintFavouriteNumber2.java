

package miscellaneous;

import java.util.Scanner;

/*
 * Read the users favorite number and display it in a message
 */
 
public class PrintFavouriteNumber2 {
	
	public static void main(String[] args) {
		
		
		System.out.println("What is your favorite number? ");
    
    Scanner scanner = new Scanner(System.in);
		int favNumber = scanner.nextInt();
    
		System.out.println("Uou! I also like " + favNumber);
		
	}

}
