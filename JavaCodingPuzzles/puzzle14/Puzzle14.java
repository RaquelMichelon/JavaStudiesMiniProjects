package puzzle14;

import java.util.Scanner;

/*
 * Will this code compile? If yes, what will be the output?
 */

public class Puzzle14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "stay inside";
		String str2 = sc.nextLine(); //I'll enter "stay inside" - the variable will be assign at the runtime
		System.out.println(str1 == str2); //compare the memory address -> output: False

	}

}

/*
 * In this program, there is no compilation error. 
 * Line 13: Stay Inside is a value that will be stored in the string pool of a Java memory; and str1 will pointing to that value;
 * Line14: the value is coming at the runtime, so java will not storage it at string pool; instead, it will create an object for that.
 * 
 * The output is: false
 */
