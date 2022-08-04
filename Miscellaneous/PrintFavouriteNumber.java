package miscellaneous;

import java.util.Scanner;

/*
 * Read the users favorite number and display it in a message
 */
 
public class PrintFavouriteNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your favorite number? ");
		int favNumber = scanner.nextInt();
		System.out.println("Uou! I also like " + favNumber);
		
	}

}
